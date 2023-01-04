import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        long j = 2;
        do {
            System.out.println(j);
            j *= j;
        } while (j <= 1000000);


        for (i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (j = 2; j <= 1000000; j *= j) {
            System.out.println(j);
        }


        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            }
        }

        for (i = 1; i <= 100; i++) {
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);
            if (divisibleBy3 && divisibleBy5) {
                System.out.println("FizzBuzz");
            } else if (divisibleBy3) {
                System.out.println("Fizz");
            } else if (divisibleBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean confirmation;

        do {
            System.out.println("What number would you like to go up to?");
            int userNumber = Integer.parseInt(scanner.next());
            System.out.println("Here is your table!");
            System.out.println("number  |  squared  |  cubed");
            System.out.println("------  |  -------  |  -----");
            for (i = 1; i <= userNumber; i++) {
                int square = i * i;
                int cubed = i * i * i;
                System.out.printf("%-7d |  %-8d |  %-5d\n", i, square, cubed);
//            System.out.print(i + "       |   ");
//            System.out.print(i * i + "       |  ");
//            System.out.print(i * i * i + "\n");
            }
            System.out.print("Continue? [y/n] ");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("y");
        } while (confirmation);


        do {
            System.out.println("What is your grade?");
//            int userGrade = Integer.parseInt(scanner.next());
            int userGrade = scanner.nextInt();
            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade < 88 && userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade < 80 && userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade < 67 && userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.print("Continue? [y/n] ");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("y");
        } while (confirmation);
    }
}
