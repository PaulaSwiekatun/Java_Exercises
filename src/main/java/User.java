//Konstruktory
//Constructors

public class User {
    public String username;
    public String password;
    public User() {

    }
    public User(String username, String password) {
        System.out.println("Hello with Constructors");
        this.username = username;
        this.password = password;


        /*username = user;
        password = pass;*/

    }

    public void sayHello() {
        System.out.println("Hello my name is " + username);
    }
}
