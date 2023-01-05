import java.util.Scanner;

public class MethodsExercises {
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
            System.out.println(num1);
            System.out.println(num2);
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

    public static void main(String[] args) {
        System.out.println(addition(2, 5));
        System.out.println(subtraction(2, 5));
        System.out.println(multiplication(25, 3));
        System.out.println(division(5, 2));
        System.out.println(modulus(5, 2));
    }
}
