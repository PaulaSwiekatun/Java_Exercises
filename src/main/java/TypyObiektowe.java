public class TypyObiektowe {

    public static void main(String[] args) {
        // liczby stałoprzecinkowe (Typ prosty)
        byte firstNumber = 127; // 1 bajt -128 do 127
        short secondNumber = 32689; // 2 bajty -32768 do 32767
        int thirdNumber = 32768999; // 4 bajty - 2 147 483 648 do 2 147 487 483 647
        long fourthBumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        //wartośc logiczna
        //boolean prawda = true;
        //boolean fałsz = false;

        //pojedyńczy znal
        char litter = 'A';

        //ciąg znaków (typ obiektowy)
        String hello = "Hello Word";

        System.out.println(hello.charAt(0));

    }
}
