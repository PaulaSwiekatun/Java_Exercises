public class Truck implements Vehicle {
    @Override
    public void driving(int speed) {
        System.out.println("I'm driving a truck at speed " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Brakes a truck");

    }

    @Override
    public String info() {
        return "Truck";
    }
}
