package org.example;

import org.example.view.*;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {
        View.getInstance().run();

    }
}
