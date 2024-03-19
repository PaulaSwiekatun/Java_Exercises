import java.util.Scanner;

/* Napisz program, który poprosi użytkownika o 2 liczby, a następnie wykona na nich podstawowe operacje
matematyczne.

Write a program that asks the user for 2 numbers and then performs basic operations on them
mathematics.*/
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number");
        int firstNumber = scanner.nextInt();
        System.out.println("gGve the second number");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();


        /*int addition = calculator.add(firstNumber, secondNumber);
        int substraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.mult(firstNumber, secondNumber);
        int division = calculator.div(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);*/

        // Druga możliwośc zapisu poniżej.
        // Second possibility of writing below.

        System.out.println("Adding: " + calculator.add(firstNumber, secondNumber));
        System.out.println("Subtraction: " + calculator.sub(firstNumber, secondNumber));
        System.out.println("Multiplication: " + calculator.mult(firstNumber, secondNumber));
        System.out.println("Division: " + calculator.div(firstNumber, secondNumber));
        System.out.println("Modulo: " + calculator.mod(firstNumber, secondNumber));
    }
}
