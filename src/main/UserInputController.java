package main;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputController {
    private ArrayList<Integer> inputs = new ArrayList<>();
    private Calculator calculator;
    private double result;

    public UserInputController(Calculator calculator) {
        this.calculator = calculator;
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to my calculator");
        System.out.println("which operation would you like to do \n" +
                "addition (input: a)\n" +
                "subtraction (input: s)\n" +
                "multiplication (input: m)\n" +
                "division (input: d)");

        String operation = scanner.nextLine();
        switch (operation) {
            case "a":
                System.out.println("you have chosen addition");
                break;
            case "s":
                System.out.println("you have chosen subtraction");
                break;
            case "m":
                System.out.println("you have chosen multiplication");
                break;
            case "d":
                System.out.println("you have chosen division");
                break;
        }
        System.out.println("please input the integers that you want to use");
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            inputs.add(num);
            System.out.println("print x to exit");
        }
        switch (operation) {
            case "a":
                result = calculator.add(inputs);
                break;
            case "m":
                result = calculator.multiply(inputs);
                break;
            case "d":
                result = calculator.divide(inputs);
                break;
            case "s":
                result = calculator.minus(inputs);
                break;
        }

        System.out.println("your awnser is " + result);

    }

}
