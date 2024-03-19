import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {


        int number = 0; // here change the numbers

        if (number == 0) {
            System.out.println("Number equal to zero");
        } else if (number > 0) {
            System.out.println("number in the plus");
        } else if (number < -5) {
            System.out.println("number less than -5");
        } else {
            System.out.println("no condition has been fulfilled");
        }
     /*to display all possible conditions in int number type and run digits:
        0 Number equal to zero
        5 number in the plus
        - 15 number less than -5
        - 4 no condition has been fulfilled

       // Aby wyświetlić wszystkie możliwe warunki w typie liczby int i uruchomić cyfry:
        0 Liczba równa zero
        5 liczba na plusie
        - 15 liczba mniejsza niż -5
        - 4 żaden warunek nie został spełniony
        */


        int number1 = 12; // here change the numbers

        if (number1 == 0) {
            System.out.println("Number equal to zero");
        } else if (number1 > 10) {
            System.out.println("number larger than 10");
        } else if (number1 > 0) {
            System.out.println("number in the plus");
        } else if (number1 < 5) {
            System.out.println("number less than -5");
        } else {
            System.out.println("no condition has been fulfilled");
        }
        /*if it encounters the right answer while checking the code - it will return the answer.
        It will not perform the next conditions.
        jeśli podczas sprawdzania kodu natrafi na właściwą odpowiedź -zwróci odpowiedź.
        Nie będzie wykonywac następnych warunków.
         */


        /* ĆWICZENIE - Zapytaj użytkownika o wiek.
        W przypadku gdy ma mniej niż 18 lat wpisz na ekranie informacje "alkohol tylko dla osób pełnoletnich"
        Gdy ma więcej niż 18 lat wypisz na ekranie "Dziękuje za zakupy"

        // EXERCISE - Ask the user's age.
       When he/she is less than 18 years old, type "alcohol for adults only" on the screen.
       When he/she is older than 18 years old type "Thank you for shopping" on the screen
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scanner.nextInt();
        if(age < 18 && age >= 0) {
            System.out.println("alcohol for adults only");
        } else if (age < 0) {
            System.out.println("enter the correct value");
        } else {
            System.out.println("Thank you for shopping");
        }
    }

}