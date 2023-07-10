package io.harness.aida;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        try {
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
            }
            assertTrue( true );
        } catch (IndexOutOfBoundsException e) {
            fail("IndexOutOfBoundsException was thrown.\nerror:\n\n" + e.getMessage());
        }

    }
    @Test
    public void SQLInjectionVulnerability() {
        String userInput = "'; DROP TABLE Users; --";
        String query = "SELECT * FROM Users WHERE username = '" + userInput + "'";
        // Execute the SQL query
        // ...
        System.out.println(query);
        assertTrue( true );
    }
}
