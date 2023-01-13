package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }

    //returns string input from user
    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    //The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise
    public boolean yesNo() {
//        System.out.println("Enter yes or no: (y/n)");
        String response = getString("Enter yes or no: (y/n)");
        return response.equals("y") || response.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        while (true) {
            try {
                return Integer.valueOf(getString());
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Try inputting a new integer: ");
            }
        }
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                return Integer.valueOf(getString());
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Try again.");
            }
        }
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %s and %s: ", min, max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
//        return Double.valueOf(getString());
        System.out.println("Enter a number: ");
        while (true) {
            try {
                return Double.valueOf(getString());
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Try inputting a new number: ");
            }
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                return Double.valueOf(getString());
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Try again.");
            }
        }
    }

    public long getBinary() {
        System.out.println("Input binary number: ");
        while (true) {
            try {
                long binary = Long.valueOf(getString(), 2);
                return binary;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not in binary. Try again.");
            }
        }
    }

    public long getNumberToBinary() {
        System.out.println("Input number to convert to binary: ");
        while (true) {
            try {
                int number = Integer.parseInt(Integer.toBinaryString(scanner.nextInt()));
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not in binary. Try again.");
            }
        }
    }

    public long getHex() {
        System.out.println("Input hexadecimal number: ");
        while (true) {
            try {
                long hex =  Long.valueOf(getString(), 16);
                return hex;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not a hexadecimal. Try again.");
            }
        }
    }
}
