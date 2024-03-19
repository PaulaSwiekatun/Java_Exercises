// Konstruktory i Konstruktory z parametrami. (this)
//Constructors and Constructors with parameters. (this)

public class UserTest {

    public static void main(String[] args) {

       // User user = new User();
        User user = new User("Cezarek","Tosia");

      /*  user.username = "Cezarek";
        user.password = "WSAD";*/

        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();



    }
}
