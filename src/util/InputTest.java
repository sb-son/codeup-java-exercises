package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString();
        System.out.println(userInput);
        System.out.println(input.toString());

        System.out.println(input.yesNo());
        System.out.println(input.getInt(1, 10));
        System.out.println(input.getInt());

    }
}
