package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StepsToConnectDB {

    public static void main(String[] args) {

    	 String url = "jdbc:postgresql://localhost:5432/college";
         String username = "postgres";
         String password = "root";
//         String sql="Insert into student values (102,'Yash','MEC')";
         String sel="SELECT * FROM student";
        try {
            // 1. Load the driver
            Class.forName("org.postgresql.Driver");

            // 2. Create connection
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database connected successfully");
            
            // 3. Create PreparedStatement
//            PreparedStatement ps = con.prepareStatement(sql);

//            // 4. Execute INSERT
//            int rows = ps.executeUpdate();
//            if (rows > 0) {
//                System.out.println("Data inserted successfully ✅");
//            }
            
            PreparedStatement ps = con.prepareStatement(sel);
            ResultSet res=ps.executeQuery();
            while(res.next()) {
            	System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3));
            }

            // 5. Close resources
            ps.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}
