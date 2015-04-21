/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javajdbc;
import java.sql.*; //so we can work with SQL databases
import javax.swing.JoptionPane;
import javax.swing.table.DefaultTableModel;

public class JavaJDBC {

    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //it will handle exceptions
        //load the JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("The driver has loaded");
        
        //connect to database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sample", "awreyt", "Ta411195");
        System.out.println("Database connected");
        
        //create database statment
        Statement SelectQuery = con.createStatement();
        
        //execute statement
        ResultSet result = SelectQuery.executeQuery("select st_id, st_fname, st_lname, st_state from student");
        
        //iterate through result set and print each record
        while (result.next())
            System.out.println(result.getString(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4));
        
        //close connection
        con.close();
    }
    
    
    
}
