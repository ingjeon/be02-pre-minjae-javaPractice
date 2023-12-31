package day10.com.example.web;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConfig2 {
    private static DataSource ds = null;
    private static DbConfig2 instance = new DbConfig2();

    private DbConfig2(){
        String configFile = "/hikari2.properties";
        HikariConfig config = new HikariConfig(configFile);
        ds = new HikariDataSource(config);
    }

    public static DbConfig2 getInstance(){
        return instance;
    }

    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = ds.getConnection();
        }catch(Exception ex){
            ex.printStackTrace(); // 로그를 남기는 코드가 있어야 한다.
            throw new RuntimeException("DB연결을 할 수 없습니다.");
        }
        return conn;
    }

    public static void close(ResultSet rs, PreparedStatement ps, Connection conn){
        try{ rs.close(); } catch(Exception ignore){}
        close(ps, conn);
    }

    public static void close(PreparedStatement ps, Connection conn){
        try{ ps.close(); } catch(Exception ignore){}
        try{ conn.close(); } catch(Exception ignore){}
    }
}
