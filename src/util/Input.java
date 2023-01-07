package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //returns string input from user
    public String getString() {
        return scanner.nextLine();
    }

    public String toString() {
        return String.format("{%n string: %s%n};", this.scanner);
    }

    //The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise
    //Question for later: why don't methods work if they are static?
    public boolean yesNo() {
        System.out.println("Enter yes or no: (y/n)");
        String response = scanner.nextLine().toLowerCase();
        return response.equals("y") || response.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            System.out.println("You entered " + userInput);
            return userInput;
        }
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %s and %s: ", min, max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            System.out.println("You entered " + userInput);
            return userInput;
        }
    }

    public double getDouble() {
        System.out.println("Enter a number: ");
        return scanner.nextDouble();
    }
}
