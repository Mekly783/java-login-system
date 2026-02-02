package carrentalsystem;
/*
 * LoginSystem.java
 * This program accepts username and password from the user.
 * Password input is masked using asterisks (*).
 * The user is given three attempts to login.
 */

import java.io.Console;
import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        // Correct login credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Number of allowed login attempts
        int attempts = 3;

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        // Loop until attempts are exhausted
        while (attempts > 0) {

            // Prompt user for username
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            // Prompt user for password (masked)
            char[] passwordArray = console.readPassword("Enter Password: ");
            String password = new String(passwordArray);

            // Check credentials
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\nLogin successful. Welcome!");
                break;
            } else {
                attempts--;
                System.out.println("\nIncorrect credentials. Attempts left: " + attempts);
            }

            // Exit after 3 failed attempts
            if (attempts == 0) {
                System.out.println("Access denied. Too many failed attempts.");
            }
        }
    }
}
