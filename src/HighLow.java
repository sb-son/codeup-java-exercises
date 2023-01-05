import java.lang.Math;
import java.util.Scanner;

public class HighLow {
//    Game Development 101
//    Welcome to the world of game development!
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"

    public static Scanner scanner = new Scanner(System.in);

    public static int randNum() {
        return (int) (Math.random() * 100 + 1);
    }

    public static int guessingGame() {
        int randNum = randNum();
        System.out.println("randNum = " + randNum);
        System.out.println("Guess the random number: ");
        int userGuess = scanner.nextInt();
        int count = 5; //limit the number of guesses

        while (userGuess < 1 || userGuess > 100) {
            System.out.println("Try again. Enter a number between 1 and 100: ");
            userGuess = scanner.nextInt();
        }

        while (userGuess != randNum && count != 1) {
            --count; //countdown on number of guesses when wrong. user gets 5 tries
            if (userGuess < randNum) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }

            if (count == 1) {
                System.out.println("Last try!\n");
            } else {
            System.out.println(count + " tries remaining\n");
            }

            System.out.println("Guess again: ");
            userGuess = scanner.nextInt();
            while (userGuess < 1 || userGuess > 100) {
                System.out.println("Try again. Enter a number between 1 and 100: ");
                userGuess = scanner.nextInt();
            }
        }
        if (userGuess == randNum) {
            System.out.println("You win. GOOD GUESS!");
        } else {
            System.out.println("You lose. Try again next time!");
        }
        return randNum;
    }


    public static void main(String[] args) {
        guessingGame();
    }
}
