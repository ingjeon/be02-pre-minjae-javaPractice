package day10.com.example.web;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//todo Connection Pool연결(HikariCP 사용) 싱글톤X
@WebServlet("/logincp")
public class LoginServletCp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //최상위경로가 resources폴더 더위로 갈수없음
        HikariConfig config = new HikariConfig("/hikari.properties");
        HikariDataSource ds = new HikariDataSource(config);

        String uid = req.getParameter("uid");
        String upw = req.getParameter("upw");

        Connection conn = null; // DB 서버와 연결하는 객체
        Statement stmt = null; // SQL을 실행하는 객체
        ResultSet rs = null; // 실행 결과를 받아오는 객체

        try {
            conn = ds.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM user WHERE uid='" + uid + "' AND upw='" + upw + "';";
            rs = stmt.executeQuery(sql);

            PrintWriter out = resp.getWriter();

            if(rs.next())
            {
                out.println("login success");
            } else {
                out.println("login failed");
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

        } finally {

            try {
                if (rs != null) rs.close();

                if (stmt != null) stmt.close();

                if (conn != null) conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
