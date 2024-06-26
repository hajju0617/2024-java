package com.green.day22;

import java.sql.*;
import java.util.*;

//Member 테이블용 Data Access Object
public class MemberDao {
    private MyConnection myConn;

    public MemberDao() {
        myConn = new MyConnection();
    }
    public int insMember(MemberEntity entity) {
        String sql = String.format("INSERT INTO member" +
                        " (mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date) " +
                        " VALUES " +
                        " ('%s', '%s', %d, '%s', '%s', '%s', %d, '%s') "
                , entity.getMemId(), entity.getMemName(), entity.getMemNumber(), entity.getAddr()
                , entity.getPhone1(), entity.getPhone2(), entity.getHeight(), entity.getDebutDate()
        );
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

    public MemberEntity selMember(String memId) {
        String sql = String.format("SELECT mem_id, mem_name, mem_number, addr, phone1" + " , phone2, height, debut_date " + " From member WHERE mem_id = '%s'", memId);
        System.out.println(sql);
        try(Connection conn = myConn.getConn();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql)) {
             if(rs.next()) {
                 MemberEntity entity = new MemberEntity();
                 entity.setMemId(memId);
                 entity.setMemName(rs.getString("mem_name"));
                 entity.setMemNumber(rs.getInt("mem_number"));
                 entity.setAddr(rs.getString("addr"));
                 entity.setPhone1(rs.getString("phone1"));
                 entity.setPhone2(rs.getString("phone2"));
                 entity.setHeight(rs.getInt("height"));
                 entity.setDebutDate(rs.getString("debut_date"));

                 return entity;
             }
             return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public List<MemberEntity> selMemberList() {
        List<MemberEntity> list = new ArrayList();
        String sql = "SELECT mem_id, mem_name, debut_date FROM member ORDER BY debut_date desc";
        System.out.println(sql);

        try(Connection conn = myConn.getConn();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql)) {

            while(rs.next()) {          // (rs.next)의 결과값은 boolean 타입 -> why? while 문 이므로.
                String memId = rs.getString("mem_id");
                String memName = rs.getString("mem_name");
                String debutDate = rs.getString("debut_date");

                MemberEntity member = new MemberEntity();
                list.add(member);
                member.setMemId(memId);
                member.setMemName(memName);
                member.setDebutDate(debutDate);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public int updMember(MemberEntity entity) {
        String mid = "";
        if(entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name = '%s' ", entity.getMemName());
        }
        if(entity.getMemNumber() > 0) {
            mid += String.format(", mem_number = %d ", entity.getMemNumber());
        }
        if(entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", addr = '%s' ", entity.getAddr());
        }
        if(entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += String.format(", phone1 = '%s' ", entity.getPhone1());
        }
        if(entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2 = '%s' ", entity.getPhone2());
        }
        if(entity.getHeight() > 0) {
            mid += String.format(", height = %d ", entity.getHeight());
        }
        mid = mid.substring(1);
        System.out.println(mid);

        String sql = String.format("UPDATE member SET %s WHERE mem_id = '%s'", mid, entity.getMemId());

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
class MemberDaoUpdateTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemNumber(6);
        member.setAddr("제주");
        member.setPhone1("011");

        int affectdRow = memberDao.updMember(member);
        System.out.printf("affectedRow: %d\n", affectdRow);
    }
}
    public int delMember(MemberEntity entity) {
        String sql = String.format("Delete from member WHERE mem_id = '%s'", entity.getMemId());    // ' ' 생각하기
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
class SubStringTest {
    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(str.substring(3));
        System.out.println(str.substring(4, 7));
        System.out.println(str);


        String str2 = ", 안녕, 하하, 좋아요";
        System.out.println(str2.startsWith(","));
        String str3 = str2.substring(1);
        System.out.println("str3: " + str3);
    }
}




class MemberDAOTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(); //객체화 했다.

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemName("뉴진스");
        member.setMemNumber(4);
        member.setAddr("대구");
        member.setPhone1("053");
        member.setPhone2("77777777");
        member.setHeight(166);
        member.setDebutDate("2022-10-01");

        int affectedRow = memberDao.insMember(member);
        System.out.printf("affectedRow: %d\n", affectedRow);
        // insMember 메소드 호출
        /*
        1. 메소드가 어디에 있는 지 확인 -> MemberDao 클래스
        2. static 메소드인지 아닌지 확인 -> why? 호출 방법이 달라짐 -> static 메소드가 아니기 때문에 MemberDao를 객체화 해야 됨
        3. 선언부를 확인하니 린턴 타입은 int, 파라미터는 MemberEntity 객체 주소값 필요한 것을 확인
        4. 메소드 선언부에 맞춰서 호출 -> MemberDao 객체 주소값 멤버참조연산자를 이용해서.
         */
    }
}

class DeleteTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(); //객체화 했다.

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");

        int affectedRow = memberDao.delMember(member);
        System.out.printf("affectedRow: %d\n", affectedRow);

    }
}

class SelListMemberTest {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        List<MemberEntity> list = dao.selMemberList();
        for(MemberEntity member : list) {
            System.out.println(member);
        }
    }
}

class SelMemberTest {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        MemberEntity entity = dao.selMember("WMN");
        System.out.println(entity);
    }
}
