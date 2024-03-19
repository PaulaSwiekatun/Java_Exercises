//Napisz program, który poprosi użytkownika o 2 lizby, a następnie wykonaj na nich operacje matematyczne.
//Write a program that asks the user for 2 numbers and then perform mathematical operations on them.

import java.util.Scanner;

public class ExMathMetods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Please provide the second number...");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = firstNumber%secondNumber;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + mod);
    }

}
