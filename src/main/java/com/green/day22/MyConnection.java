package com.green.day22;
import java.sql.*;

public class MyConnection {
    private final String DRIVER = "org.mariadb.jdbc.Driver"; // External Libraries -> org.mariadb.jdbc -> driver 클래스
    private  final String HOST = "localhost"; // 나 자신의 DB에 접속하므로 localhost, 다른 사람껄 쓰고 싶다면 윈+R -> cmd -> ipconfig -> ip주소 사용
    private final String PORT = "3306";
    private final String DB_NAME = "market_db"; // DB에서 사용 하던 데이터베이스 이름
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public Connection getConn() throws SQLException, ClassNotFoundException {
        // jdbc: mariadb://localhost:3306/market_db
        String url = String.format("jdbc:mariadb://%s:%s/%s", HOST, PORT, DB_NAME);     // 접속 주소값
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        System.out.println("DB 접속 완료!");
        return conn;
    }
    public void close(Connection conn) {
        if(conn == null) { return; }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Statement stat, Connection conn) {
        if(stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn);
    }
    class MyConnectionTest {
        public static void main(String[] args) {
            MyConnection myConn = new MyConnection();
            Connection conn = null;
            try {
                conn = myConn.getConn();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                myConn.close(conn); // 인스턴스 메소드 (참조변수.메소드()) , void, 메소드명 : close, 파마미터1개, 1개 타입은? -> Connection 객체 주소
//        MyConnection.close(conn) -> 클래스 메소드 (static 사용해야 함)
            }
        }
    }
}
