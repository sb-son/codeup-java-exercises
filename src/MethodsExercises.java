import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return (num1 + multiplication(num1, num2 - 1));
        } else if (num2 < 0) {
            return (-multiplication(num1, -num2));
        }
        return num1;

//        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput <= min || userInput >= max) {
            return getInteger(min, max);
        } else {
        System.out.println("You entered " + userInput);
        return userInput;
        }
    }

    public static long factorial() {
        int factorial;
        int number;
        while (true) {
            do {
                System.out.println("Enter a number between 1 and 10: ");
                number = scanner.nextInt();
            } while (number < 1 || number > 10);

            factorial = 1;
            String multiplyStr = "";
            for (int i = 1; i <= number; i++) {
                factorial *= i;
                multiplyStr += i;
                System.out.printf("%d! = %-20s = %-8d\n", i, multiplyStr, factorial);
                if (i < number) {
                    multiplyStr += " x ";
                }
            }
            System.out.println("The factorial of " + number + " is " + factorial);

            System.out.println("Do you want to continue? (y/n)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }
        return factorial;
    }

    public static int factorialRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        int result;
        result = number * factorialRecursion(number - 1);
        return result;
    }


    public static void main(String[] args) {
        System.out.println(addition(2, 5));
        System.out.println(subtraction(2, 5));
        System.out.println(multiplication(25, 3));
        System.out.println(division(5, 2));
        System.out.println(modulus(5, 2));
//        getInteger(1, 10);
        factorial();
        System.out.println(factorialRecursion(4));
    }
}
