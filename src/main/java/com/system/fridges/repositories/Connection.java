package com.system.fridges.repositories;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    public static java.sql.Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("","user", "Pavlo1212004");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
