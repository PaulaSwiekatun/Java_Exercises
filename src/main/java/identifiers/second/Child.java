package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    //Klasa potomna w innej paczce nie ma dostępu do pól/metod private oraz default czyli bez identyfikatora.
    /*A child class in another package does not have access to private and default fields/methods i.e.
    without an identifier.*/
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();

    }
    }

