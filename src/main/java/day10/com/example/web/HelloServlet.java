package day10.com.example.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet("/jsp")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // request 변수에 클라이언트가 HTTP 프로토콜로 요청한 모든게 저장되어 있음
        // request 변수에 저장된 HttpServletRequest 객체에
        // getParameter() 메소드로 클라이언트가 보내준 데이터를 받아온다.
        String name = request.getParameter("name"); // /jsp?name=j 부분에서 name에 j 저장

        Connection conn = null; // DB 서버와 연결하는 객체
        Statement stmt = null; // SQL을 실행하는 객체
        ResultSet rs = null; // 실행 결과를 받아오는 객체
        try {
            // db 정보 5개   ip주소  포트번호  db이름  id  pw
            String url = "jdbc:mysql://11.11.11.50:3306/web";
            String id = "jmj";
            String pw = "qwer1234";
            //
            conn = DriverManager.getConnection(url, id, pw); // java.sql.connection 반환
            stmt = conn.createStatement();   // java.sql.Statement 반환
            // SQL 문법 양식에  문자열만 추가하기 주의 ' "+name+" '
            String sql = "SELECT * FROM student WHERE name='" + name + "'";
            rs = stmt.executeQuery(sql);  // java.sql.ResultSet 반환

            // response 변수에 클라이언트에게 HTTP 프로토콜로 응답할 모든게 저장되어 있음
            // response 변수에 저장된 HttpServletResponse 객체에
            // getWriter() 메소드를 통해서 outputstream을 받아오고
            // 해당 스트림을 통해서 데이터를 출력하면
            // 클라이언트 웹 브라우저에 내용이 출력된다.
            response.setCharacterEncoding("UTF-8"); // PrintWriter out 한글 출력위해
            response.setContentType("text/html; charset=UTF-8"); // PrintWriter out 한글 출력위해
            PrintWriter out = response.getWriter();      // 웹 화면에 출력 하기 위해

            while (rs.next()) {
                out.println(rs.getString("name")); // java.sql.ResultSet 반환 값중 name속성
                out.println(rs.getInt("age"));    //  java.sql.ResultSet 반환 값중 age속성
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        System.out.println(request.getMethod());      // GET      내가 요청한 방식
        System.out.println(request.getHeaderNames()); //          내가 요청한 헤더이름?
        System.out.println(request.getQueryString()); // name=j   ?이후로 내가 요청한부분
        System.out.println(request.getRequestURI());  // /jsp     uri id
        System.out.println("클라이언트가 웹 브라우저로 클래스 파일을 실행");
    }
//        System.out.println(request.getMethod());
//        System.out.println(request.getHeaderNames());
//        System.out.println(request.getQueryString());
//        System.out.println(request.getRequestURI());
//
//        System.out.println("클라이언트가 웹 브라우저로 클래스 파일을 실행");
}
