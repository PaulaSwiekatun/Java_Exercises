// Nie możemy zmienić zmiennej którą została przypisana do wartości.

// Cannot assigne a value to final varianle.

public class FinalTest {

    public static void main(String[] args) {
        final int X = 2;

        final Person person = new Person("Paula", 38);
        person.age = 40;


    }
}
