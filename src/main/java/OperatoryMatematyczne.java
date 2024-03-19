// Operatory matematyczne umożliwiają wykonywanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F; // aby mieć po przecinku wynk dodat float jako trzecią zmienną. Inaczej będzie 0.

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber/secondNumber; //0,66
        int mod = secondNumber%firstNumber; // 4 mieści się w 6 raz, czyli 6 - 4 = (2 oczekiwany rezutat)

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("odejmowanie " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod);

        // nadpisywanie zmiennych do już istniejącej np. fistNumber.

        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber); //10
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber);  //4
        firstNumber*=secondNumber;  //firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); //24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu:" + firstNumber); //4
        firstNumber%=secondNumber;  // firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber); //4
    }
}
