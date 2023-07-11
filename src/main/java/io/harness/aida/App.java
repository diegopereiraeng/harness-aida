package io.harness.aida;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


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
        
        Random random = new Random();
        int insecureNumber = random.nextInt();
        System.out.println("Insecure random number: " + insecureNumber);
        
        System.out.println(query);
        

        String algorithm = "DES";
        KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
        SecretKey secretKey = keyGenerator.generateKey();
        byte[] keyBytes = secretKey.getEncoded();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, algorithm);
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedData = cipher.doFinal("Sensitive Data".getBytes());
        System.out.println("Encrypted data: " + new String(encryptedData));


        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (int i = 0; i <= names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
