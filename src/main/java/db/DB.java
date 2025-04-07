package db;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class DB {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null){
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            connection = DriverManager.getConnection(url, props);
            String user = props.getProperty("user");
            String password = props.getProperty("password");
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new db.DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("src/main/resources/db.properties")){
            Properties ps = new Properties();
            ps.load(fs);
            return ps;
        } catch (IOException e) {
            throw new db.DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st){
        if (st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new db.DbException(e.getMessage());
            }
        }
    }

    public static void closeResult(ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new db.DbException(e.getMessage());
            }
        }
    }

}
