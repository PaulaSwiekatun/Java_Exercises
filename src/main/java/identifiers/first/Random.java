package identifiers.first;

public class Random {

    //Klasa w tej samej paczce nie ma dostępu do pól/metod private.
    //Class in the same package does not have access to private fields/methods.
    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        parent.firstMethod();
        parent.secondtMethod();
        parent.thirdMethod();

    }
}
