// Klasa bazowa.
// Base class
// Dziedziczenie. Pozwala na tworzeniu hierarchii klas,
// która pozwoli na przekazanie  cech bazowych klasą podobnym.
public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        System.out.println("I am in the constructor Person");
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println("I like pizza");
    }
    public void playBoardGames() {
        System.out.println("I like to play board games");
    }
}
