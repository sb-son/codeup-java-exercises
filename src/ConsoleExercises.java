import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        System.out.print("Enter a number: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("You entered: " + userNumber);


//        System.out.println("Enter three words: ");
//        String threeWords = scanner.next();
////        System.out.printf("you entered %s", threeWords);
//        if (scanner.hasNextLine()) {
//            System.out.printf("Word 1: %s", threeWords);
//        }

//        System.out.println("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.printf(sentence);

        System.out.println("What is the width of your room? What is the length of your room?");
//        String width = scanner.nextLine();
//        System.out.println("What is the length of your room?");
//        String length = scanner.nextLine();
        int width = Integer.parseInt(scanner.next());
        int length = Integer.parseInt(scanner.next());
        int total = width * length;
        System.out.println(total);

//        int parseWidth = Integer.parseInt(width);
//        int parseLength = Integer.parseInt(length);
//        int total = parseWidth * parseLength;
//        System.out.println("The area of your room is " + total);
//        System.out.println("The perimeter of your room is " + total * 2);
    }
}
