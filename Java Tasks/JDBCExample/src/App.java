package JDBCExample.src;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", 
                "root",  
                "12345678"   
            );

            if (con != null) {
                System.out.println("Connection Successful!");
            } else {
                System.out.println("Connection Failed!");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
