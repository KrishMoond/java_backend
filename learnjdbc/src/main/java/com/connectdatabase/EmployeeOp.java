package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeOp {

    // Database connection details
    static String url = "jdbc:postgresql://localhost:5432/college";
    static String un = "postgres";
    static String pwd = "root";

    public static void main(String[] args) {

        try {
            // Load PostgreSQL Driver
            Class.forName("org.postgresql.Driver");

            // CRUD operations
            createEmployeeTable();
            insertEmployee(1, "Yash", "CSE", 50000);
            insertEmployee(2, "Abhinav", "IT", 45000);

            updateEmployeeName(1, "Yash Sindhu");

            deleteEmployee(2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 1️⃣ Create Employee Table
    public static void createEmployeeTable() throws SQLException {
        Connection con = DriverManager.getConnection(url, un, pwd);
        Statement stmt = con.createStatement();

        // Drop table if already exists (to avoid mismatch issues)
        String dropSql = "DROP TABLE IF EXISTS employee";
        stmt.execute(dropSql);

        String createSql = "CREATE TABLE employee ("
                + "id INTEGER PRIMARY KEY, "
                + "name VARCHAR(30), "
                + "dept VARCHAR(20), "
                + "salary INTEGER"
                + ")";

        stmt.execute(createSql);
        System.out.println("Employee table created successfully");

        con.close();
    }

    // 2️⃣ Insert Employee
    public static void insertEmployee(int id, String name, String dept, int salary) throws SQLException {
        Connection con = DriverManager.getConnection(url, un, pwd);

        String sql = "INSERT INTO employee (id, name, dept, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, dept);
        ps.setInt(4, salary);

        ps.executeUpdate();
        System.out.println("Inserted: " + name);

        con.close();
    }

    // 3️⃣ Update Employee Name
    public static void updateEmployeeName(int id, String newName) throws SQLException {
        Connection con = DriverManager.getConnection(url, un, pwd);

        String sql = "UPDATE employee SET name = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, newName);
        ps.setInt(2, id);

        ps.executeUpdate();
        System.out.println("Updated Employee ID " + id);

        con.close();
    }

    // 4️⃣ Delete Employee
    public static void deleteEmployee(int id) throws SQLException {
        Connection con = DriverManager.getConnection(url, un, pwd);

        String sql = "DELETE FROM employee WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ps.executeUpdate();
        System.out.println("Deleted Employee ID " + id);

        con.close();
    }
}
