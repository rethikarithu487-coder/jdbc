package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    static void main() {
        try {
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc",
                    "root",
                    "Abhirdy09"
            );

            System.out.println("data base connected");

            Statement stmt = cn.createStatement();

            String sql = "INSERT INTO employe(name,salary) VALUES('trish',150)";
            stmt.executeUpdate(sql);

            System.out.println("employe inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}