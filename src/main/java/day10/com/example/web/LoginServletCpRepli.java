package day10.com.example.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

//todo Connection Pool연결(HikariCP 사용) 싱글톤O
// master slave 추가
@WebServlet("/logincprepli")
public class LoginServletCpRepli extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uid = req.getParameter("uid");
        String upw = req.getParameter("upw");

        Connection conn = null; // DB 서버와 연결하는 객체
        PreparedStatement pstmt = null;
        ResultSet rs = null; // 실행 결과를 받아오는 객체


        Statement stmt2 = null; // SQL을 실행하는 객체

        try {
            conn = DbConfig.getInstance().getConnection();
            String sql = "SELECT * FROM user WHERE uid = ? AND upw = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, uid);
            pstmt.setString(2, upw);

            rs = pstmt.executeQuery();

            PrintWriter out;
            out = resp.getWriter();


            if (rs.next()) {
                out.println("login success");
            } else {
                out.println("login failed");
            }

            conn = DbConfig.getInstance().getConnection();
            stmt2 = conn.createStatement();
            String sql2 = "INSERT INTO insertTest VALUES ('j','q');";
            Integer result = stmt2.executeUpdate(sql2);

            if (result > 0) {
                System.out.println("정상적으로 insert 됐다");
            } else {
                System.out.println("insert 안됨");
            }


        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            DbConfig.close(rs, pstmt, conn);
        }

    }
}