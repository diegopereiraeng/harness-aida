package io.harness.aida;

import java.util.ArrayList;
import java.util.List;

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
        // ...
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
