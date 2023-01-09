package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            System.out.println("What is the radius of the circle?");
            double userInput = input.getDouble();
            Circle circle = new Circle(userInput);
            System.out.printf("The radius of the circle is: %.2f%nThe area of the circle is: %.2f%nThe circumference of the circle is: %.2f%n", circle.getRadius(), circle.getArea(), circle.getCircumference());
            System.out.println(circle.toString());

            //input.yesNo() returns false by default
            System.out.println("Would you like to make another circle?");
            input.getString();
        } while (input.yesNo());

    }

}
