public class ExIfElse {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;
        // float dzielnik = 0;

        if(dzielnik != 0) {
            System.out.println(("the result of division is: " + dzielna/dzielnik));
        } else {
            System.out.println("Please provide another number");
        } // Aby uruchomić warunek else z pośbą o podanie innej liczby odkomentuj 6 linijkę lub w 5 linijce zmień liczbę na "0"
        // To run an else condition with a request for another number uncomment the 6th line or in the 5th line change the number to "0"


        /* temperature is equal to or less than zero, and if it is, it will display a warning to wear a hat.
        Otherwise, the program wishes you a sunny day.*/
        int temp = 5;

        if (temp <= 0) {
            System.out.println("Wear a hat the temperature is " + temp + "degrees");
        } else {
            System.out.println("Wish you a sunny day, the temperature is " + temp);
        }


    }

}