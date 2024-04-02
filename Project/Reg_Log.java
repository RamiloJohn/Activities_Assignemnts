package ProjectFTS;

import java.io.*;
import java.util.Scanner;

public class Reg_Log {

    private static final String FILENAME = "user_credentials.txt";

    public static void register() {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Registration Page!!");

        System.out.print("Enter Username: ");
        String username = read.nextLine();
        System.out.print("Enter Password: ");
        String password = read.nextLine();
        System.out.print("Confirm Password: ");
        String cPassword = read.nextLine();

        if (password.equals(cPassword)) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true)); // Open in append mode
                writer.write(username + "," + password + "\n"); // Add newline character
                writer.close();
                System.out.println("Registration successful. Please proceed to login.");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("Passwords do not match. Please retry!!");
            System.out.println();
            register();
        }
    }

    public static void login() {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Login Page");

        System.out.print("Enter Username: ");
        String username2 = read.nextLine();
        System.out.print("Enter Password: ");
        String password2 = read.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                String registeredUsername = credentials[0];
                String registeredPassword = credentials[1];
                if (registeredUsername.equals(username2) && registeredPassword.equals(password2)) {
                    found = true;
                    break;
                }
            }
            reader.close();
            if (found) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect username or password. Please try again.");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
