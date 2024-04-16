    package com.green.day23;

    import com.green.day22.MemberDao;
    import com.green.day22.MemberEntity;
import com.green.day22.MyConnection;

    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;

    public class BuyDao {
    private final MyConnection myConn;

    public BuyDao() {
        myConn = new MyConnection();
    }

    public int insBuy(BuyEntity entity) {
        String sql = " INSERT INTO buy (mem_id, prod_name, group_name, price, amount) " +
                " VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 위 insBuy 메소드 응용해서 ? 를 활용했음
    public int updBuy(BuyEntity entity) {   // num 컬럼 제외 모든 컬럼 수정
        String sql = " UPDATE buy SET mem_id = ?, prod_name = ? ,group_name = ?, price = ?, amount = ? WHERE num = ? ";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            ps.setInt(6, entity.getNum());
            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<BuySelVo> selBuyGroupByMemId() {
        List<BuySelVo> list = new ArrayList<>();
        String sql = "SELECT mem_id, count(mem_id) AS buy_count FROM buy GROUP BY mem_id";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement((sql));
             ResultSet rs = ps.executeQuery()) {

            while(rs.next()) {
                String memId = rs.getString("mem_id");
                int buyCount = rs.getInt("buy_count");
                BuySelVo vo = new BuySelVo(memId, buyCount);
                list.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public int delBuy(int num) {
        String sql = String.format("DELETE from buy WHERE num = '%d'", num);
        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }

        return result;
    }


}
class BuyDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();   // MyConnection 객체 주소값 갖게 된다.
        BuyEntity entity = new BuyEntity();
        entity.setMemId("RED");
        entity.setProdName("구두");
        entity.setGroupName("패션");
        entity.setPrice(300);
        entity.setAmount(3);

        int affectedRow = buyDao.insBuy(entity);
        System.out.printf("affectedRow: %d\n", affectedRow  );
    }
}

class BuyDaoUpdateTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        BuyEntity buy = new BuyEntity();

        buy.setNum(21);     // PK 지정 -> Intellij랑 db랑은 별개로 생각.
        buy.setMemId("TWC");
        buy.setProdName("코트");
        buy.setGroupName("티셔츠");
        buy.setPrice(2);
        buy.setAmount(1);


        int affectdRow = buyDao.updBuy(buy);
        System.out.printf("affectedRow: %d\n", affectdRow);
    }
}

class DeleteTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();

        int affectedRow = buyDao.delBuy(21);
        System.out.printf("affectedRow: %d\n", affectedRow);
    }
}

class BuySelListDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        List<BuySelVo> list = buyDao.selBuyGroupByMemId();
        for(BuySelVo vo : list) {
            System.out.println(vo);
        }
    }
}