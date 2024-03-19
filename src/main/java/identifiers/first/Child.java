package identifiers.first;

public class Child extends Parent {

    //Klasa potomna w tej samej paczce nie ma dostępu do pól/metod private.
    //A child class in the same package does not have access to private fields/methods.
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondtMethod();
        thirdMethod();

    }

}
