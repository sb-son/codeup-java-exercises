import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        boolean keepRunning = true;

        while(true) {
            System.out.println("\nWant to play a game? Ask me a question ME>");
            String input = scanner.nextLine();

            boolean question = input.endsWith("?");
            boolean yelling = input.endsWith("!");
            boolean empty = input.isEmpty();
            boolean quit = input.equals("I QUIT");

            if (question) {
                System.out.println("BOB > Sure.\n");
            } else if (yelling) {
                System.out.println("BOB > Whoa, chill out!\n");
            } else if (empty) {
                System.out.println("BOB > Fine, Be that way");
            } else if (quit) {
                System.out.println("BOB > Guess you couldn't hack it...\n");
//                keepRunning = false;
                break;
            } else {
                System.out.println("BOB > Whatever.\n");
            }
        }
    }
}
