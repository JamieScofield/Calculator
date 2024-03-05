package main;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInputController controller = new UserInputController(calculator);
        controller.run();

    }
}