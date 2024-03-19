// zarezerwowane miejsce w pamięci z określonym typem danych
public class Zmienne {
    // String name "Paula"; 1 typ danych, 2 nazwa, 3 wartość.


    public static void main(String[] args) {
        // deklarowanie zmiennych drugi sposób bez przypisania wartości.
//        int firstNumber;
//        int secondNumber;
//        int result;

        String name = ("Paula");
        int firstNumber = 1;
        int secondNumber = 2;
        int result = firstNumber + secondNumber;
        //System.out.println(result);

        // nadpisanie wartości name "Joanna" nad "Paula"
        name = "Joanna";
        System.out.println(name);
        System.out.println(result);
    }
}
