package carrentalsystem;
import java.io.Console;
import java.util.Scanner;

/**
 * LoginSystem class
 * Handles username and password authentication
 * Allows a maximum of 3 login attempts
 */
public class LoginSystem {

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "password123";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();
        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            String password;

            // Mask password input
            if (console != null) {
                char[] pwd = console.readPassword("Enter Password: ");
                password = new String(pwd);
            } else {
                System.out.print("Enter Password: ");
                password = scanner.nextLine();
                System.out.println("******** (Password masked)");
            }

            if (username.equals(CORRECT_USERNAME) &&
                password.equals(CORRECT_PASSWORD)) {

                System.out.println("\nLogin successful. Welcome!");
                break;

            } else {
                attempts--;
                System.out.println("\nIncorrect username or password.");
                System.out.println("Attempts remaining: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("\nAccess denied. Too many failed attempts.");
            }

            System.out.println("----------------------------");
        }

        scanner.close();
    }
}

