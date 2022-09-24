package com.solvd.laba.university;

import com.solvd.laba.university.connection.BasicConnectionPool;
import com.solvd.laba.university.connection.ConnectionPool;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(Main.class);
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "terminator";

    public static void main(String[] args) {
        try {
            ConnectionPool connectionPool = BasicConnectionPool.create(URL, USERNAME, PASSWORD);
            try (Statement statement = connectionPool.getConnection().createStatement()) {
                statement.execute("DELETE FROM `mydb`.`faculties` WHERE (`id` = '5');");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}