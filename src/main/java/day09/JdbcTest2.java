package day09;

import java.sql.*;
import java.util.Scanner;

public class JdbcTest2 {
    public static void main(String[] args) {
        Connection conn = null; // DB 서버와 연결하는 객체
        Statement stmt = null;// sql을 실행하는 객체
        ResultSet rs = null;// 실행 결과를 받아오는 객체
        try {
            // db 정보 5개   ip주소  포트번호  db이름  id  pw
            String url = "jdbc:mysql://11.11.11.50/web";
            String id = "jmj";
            String pw = "qwer1234";
            conn = DriverManager.getConnection(url,id,pw);// SQL연결 , java.sql.Connection 반환
            // Do something with the Connection
            stmt = conn.createStatement(); // java.sql.Statement 반환
            // 입력 받아서 가능
            Scanner sc = new Scanner(System.in);

            String name = "name"; // 입력 값 name 변수에 저장
            int age = 20;
            // SQL 문법 양식에  문자열만 추가하기 주의 "IN~~'"  +name+  "'~~~)"
            String sql = "INSERT INTO student (name, age) VALUES ('" + name + "', " + age + ");";
            Integer result = stmt.executeUpdate(sql); // 성공한 row count 반환 성공한게 없으면 0

            if(result>0) System.out.println("정상적으로 insert 됐다");
            else System.out.println("insert 실패");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}

