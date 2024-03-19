import java.util.Scanner;

public class ExComparisonOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Please provide the second number...");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " > " + secondNumber + ": " + (firstNumber > secondNumber));
        System.out.println(firstNumber + " < " + secondNumber + ": " + (firstNumber < secondNumber));
        System.out.println(firstNumber + " >= " + secondNumber + ": " + (firstNumber >= secondNumber));
        System.out.println(firstNumber + " <= " + secondNumber + ": " + (firstNumber <= secondNumber));
        System.out.println(firstNumber + " == " + secondNumber + ": " + (firstNumber == secondNumber));
        System.out.println(firstNumber + " != " + secondNumber + ": " + (firstNumber != secondNumber));
    }
}
