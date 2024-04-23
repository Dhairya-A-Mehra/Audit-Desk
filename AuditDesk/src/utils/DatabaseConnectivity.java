package utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnectivity {
    private static String uname = "root";
    private static String pass = "rutu2004"; //enter your mysql password here
    private static String url = "jdbc:mysql://127.0.0.1:3306/pbl1";

    public static Connection connectDatabase(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,
                uname, pass);
            return conn;
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
        return null;
    }
    
    public static void closeConnection(Connection conn) {
        
        // verifying connection is still running
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("SQL Error: " + e.getMessage());
            }
        }
    }
    
}
