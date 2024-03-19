import java.util.Scanner;

// WPISZ SWOJE IMIE.

/*public class CustomScanner {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Proszę, podaj swoje imie");
       String name = scanner.nextLine();
       System.out.println("Czesc " + name + " !");

}*/


public class CustomScanner {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Proszę, podaj pierwszą liczbę"); //wpisuje 4 i powinno wyjśc w odp. 16.
       int firstNumber = scanner.nextInt();

      // int result = firstNumber * firstNumber;
       System.out.println("Kwadrat tej liczby to: " +  firstNumber*firstNumber);

    }
}

