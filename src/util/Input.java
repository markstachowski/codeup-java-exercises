package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt() {
        if (!scanner.hasNextInt()) {
            System.out.println("Not valid integer. Try again.");
            scanner.nextLine();
            return getInt();
        } else {
            return scanner.nextInt();
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Number out of range!");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        if (!scanner.hasNextDouble()) {
            System.out.println("Not valid integer. Try again.");
            scanner.nextLine();
            return getDouble();
        } else {
            return scanner.nextDouble();
        }
    }

    public double getDouble(int min, int max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Number out of range!");
            return getDouble(min, max);
        }
    }

// This section of Input Class is for Exceptions and Handling exercises only... Remember to uncomment out MovieApplication.java
public int getInt(String s) {
    try {
        int inputString = Integer.valueOf(s);
        return inputString;
    } catch (NumberFormatException e) {
        System.out.println("This is not a valid integer");
    }
    return 0;
}

    public double getDouble(String s) {
        try {
            Double inputString = Double.valueOf(s);
            return inputString;
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid double");
        }
        return 0;
    }

}