package identifiers.second;

import identifiers.first.Parent;

public class Random {

    /*Klasa w innej paczce nie ma dostępu do pól/metod private
    oraz default czyli bez identygikatora i protected./*

    /*A class in another package does not have access to fields/methods private
     and default that is without identifier and protected.*/

    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        parent.firstMethod();


    }
}
