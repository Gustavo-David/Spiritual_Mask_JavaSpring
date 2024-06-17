package com.example.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConection {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("url");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException("ERRO connection" + e);
            }
            return conn;
        }
        return conn;
    }

    public static void closeConnection() {
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            throw new DbException("Error closing connection" + e.getMessage());
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream arquivo = new FileInputStream("db.properties")) {

            Properties props = new Properties();
            props.load(arquivo);
            return props;
        } catch (IOException e) {
            throw new DbException("Error loading properties" + e.getMessage());
        }
    }
}
