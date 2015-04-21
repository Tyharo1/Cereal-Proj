import java.sql.*;
import java.sql.DriverManager;

public class connectDB {
    static Connection getConnection() throws Exception {
        //create a string that holds the url to the database
        String url = "jdbc:mysql://localhost/";
        //create a string that holds database name
        String dbname = "sample";
        //create a string that holds the driver 
        String driver = "com.mysql.jdbc.Driver";
        //create a string that holds the username to the database
        String username = "awreyt";
        //create a string that holds the password to the username stated above
        String password = "Ta411195";
        
        Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url + dbname, username, password);
        
        System.out.println("Database connected");
        return conn;
    }
    
    
    //method to call in order to close the connection to the database
    public static void closeConnection(Connection conn) {
        try{
            conn.close();
        }
        
        catch (SQLException ex) {
        }
        
       
    }
    
    
    
}