package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class SimpleJDBCTest {

    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/EmployeeDB";
        String username = "public";
        String password = "tiger";
        String query = "SELECT * FROM Employee";
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int empID = rs.getInt("ID");
                String first = rs.getString("FIRSTNAME");
                String last = rs.getString("LASTNAME");
                Date birthDate = rs.getDate("BIRTHDATE");
                float salary = rs.getFloat("SALARY");
                System.out.format("Employee ID:   %s%n"
                        + "Employee Name: %s %s%n"
                        + "Birth Date:    %s%n"
                        + "Salary:        %s%n%n",
                        empID, first, last, birthDate, salary);
            } // end of while
        } catch (SQLException e) {
            System.out.println ("SQLException: " + e);
        } // end of try-with-resources
    }
}