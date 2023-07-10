package io.harness.aida;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String userInput = args[0];
        String query = "SELECT * FROM Users WHERE username = '" + userInput + "'";

        // Execute the SQL query
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            // Process the query result
            // ...
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(query);


        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (int i = 0; i <= names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
