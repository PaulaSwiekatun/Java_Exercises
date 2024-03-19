package animals;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Miau");
        sayHello();
        System.out.println("Number of legs: " + legs);
    }
}
