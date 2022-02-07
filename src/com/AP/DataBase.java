package com.AP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class DataBase {

    String DB = "jdbc:mysql://localhost:3306/Darāmās lietas";
    String USER = "root";
    String PASS = "C6Xlwres*I9UsPec9thu";
    static final String QUERY = "SELECT id, task FROM Checklist";

    //insert
    public void insert() {
        try (
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {

            String sql = "INSERT INTO Checklist (task) VALUES (task)";
            stmt.executeUpdate(sql);

            System.out.println("Saglabats");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        //Select
        public void select() {
            try (
                    Connection conn = DriverManager.getConnection(DB, USER, PASS);
                    Statement stmt = conn.createStatement();
                    ResultSet resultSet = stmt.executeQuery(QUERY);
            ) {
                while (resultSet.next()) {
                    System.out.println("id" + resultSet.getInt("id"));
                    System.out.println("task" + resultSet.getString("task"));
                    System.out.println(" ");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    //update
    public void update() {
        try (
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {

            String sql = "UPDATE Checklist SET email = 'mainits@mainits.lv' WHERE id = 1";
            stmt.executeUpdate(sql);

            System.out.println("Atjaunots");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //delete
    public void delete() {

        try (
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {

            String sql = "DELETE FROM Checklist WHERE id = 2";
            stmt.executeUpdate(sql);

            System.out.println("Dzēsts");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

