package day09;

import day05.Str;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {
        //todo Connetciton DB와의 소켓통신 느낌
        // 밑에 3개 컬렉션프레임웍 처럼 생각
        Connection conn = null; // DB 서버와 연결하는 객체
        Statement stmt = null;// sql을 실행하는 객체
        ResultSet rs = null;// 실행 결과를 받아오는 객체
        try {
            // db 정보 5개   ip주소  포트번호  db이름  id  pw
            String url = "jdbc:mysql://11.11.11.50/web";
            String id = "jmj";
            String pw = "qwer1234";
            conn = DriverManager.getConnection(url,id,pw);  // java.sql.Connection 반환
            // Do something with the Connection
            stmt = conn.createStatement(); // java.sql.Statement 반환
            String sql = "SELECT * FROM student;";
            rs = stmt.executeQuery(sql); // SELECT 테이블 반환, java.sql.ResultSet 반환

            while(rs.next()) // Set 하나씩 순회
            {
                // name 속성의 값
                String name = rs.getString("name");
                System.out.print(name+" ");
                // age 속성의 값
                Integer age =  rs.getInt("age");
                System.out.println(age);
            }

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}

