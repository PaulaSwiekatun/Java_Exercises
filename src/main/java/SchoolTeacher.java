
public class SchoolTeacher extends Person{

    public String school;

    public SchoolTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("I am in the constructor Teacher");
    }

    // Metoda nadpisania nad metode z klasy nadrzędnej.
    // Override method overrides the method from the parent class.
    public void playBoardGames() {
        System.out.println("I like playing educational games");
    }



    public void teach () {
        System.out.println("I am teaching at " + school);
    }
    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);

    }
}
