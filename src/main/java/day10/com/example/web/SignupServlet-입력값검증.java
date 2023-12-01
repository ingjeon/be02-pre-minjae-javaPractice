package day10.com.example.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uid = req.getParameter("uid");
        String upw = req.getParameter("upw");


        upw = upw.replace("<", "&lt");
        upw = upw.replace(">", "&gt");

        Connection conn = null; // DB 서버와 연결하는 객체
        Statement stmt = null; // SQL을 실행하는 객체
        ResultSet rs = null; // 실행 결과를 받아오는 객체
        try {
            String url = "jdbc:mysql://10.10.10.10:3306/aaa";
            String id = "test01";
            String pw = "qwer1234";
            conn = DriverManager.getConnection(url, id, pw);
            stmt = conn.createStatement();

            String sql = "INSERT INTO user (uid, upw) VALUES ('"+uid+"','"+upw+"');";
            Integer result = stmt.executeUpdate(sql);

            if (result > 0) {
                System.out.println("정상적으로 insert 됐다");
            } else {
                System.out.println("insert 안됨");
            }


        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }
}
