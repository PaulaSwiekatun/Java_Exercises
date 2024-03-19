public class Footballer extends Person {

    public String footballerClub;

    public Footballer(String name, int age, String footballerClub) {
        super(name, age);
        this.footballerClub = footballerClub;
        System.out.println("I am in the constructor Footballer");
    }

    // Metoda nadpisania nad metode z klasy nadrzędnej.
    // Override method overrides the method from the parent class.
    public void eat() {
        System.out.println("I like healthy food");
    }

    public void playFootbal() {
        System.out.println("I like to play football for " + footballerClub);

    }
   public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
