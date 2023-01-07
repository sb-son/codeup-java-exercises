package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String toString() {
        return String.format("{%n string: %s%n};", this.scanner);
    }
}
