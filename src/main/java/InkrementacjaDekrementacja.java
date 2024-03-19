import java.sql.SQLOutput;

public class InkrementacjaDekrementacja {
    public static void main(String[] args) {


        // Inkrementacja +1 zwiększenie waartości
        // Dekrementacja -1 zmniejszenie wartości.

        // Post najpierw przypisuje starej wartości a poźniej zwiększa o 1. (a++) "Post jak po"
        // Pre zwiększa wartość zmiennej a poźniej dodawana jest kolejna wartość zmiennej (++a) "Pre jak przed"


        int a = 0;
        System.out.println("Wartość a: " + a); // 0
        int b = a++;   // post inkrementacja zwiększamy wartość o 1.
        System.out.println("Wartość b: " + b); // 0
        System.out.println("Wartość a: " + a); // 1


        int c = ++a;   // pre inkrementacja zwiększamy wartośc a (o 1) i przypisujemy tą wartośc do zmiennej c.
        System.out.println("Wartość c: " + c); // 2
        System.out.println("Wartość a: " + a); //2

        // Dekrementacja zmniejszenie wartości o 1.
        int d = 0;
        System.out.println("Wartość d: " + d); //0
        int e = d--;
        System.out.println("Wartość e: " + e); //0
        System.out.println("Wartość d "+ d); // -1
        int f = --d;
        System.out.println("Wartość f: " + f); // -2
        System.out.println("Wartość d: " + d); // -2
    }
}
