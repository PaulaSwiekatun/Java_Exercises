public class Bike implements Vehicle {


    @Override
    public void driving(int speed) {
        System.out.println("I'm riding my bicycle at speed " + speed);
    }

    @Override
    public void stop() {
        System.out.println("brakes a bike");

    }

    @Override
    public String info() {
        return "Bike";
    }
    public void tank() {
        System.out.println("In order to have the strength to drive I have to eat a good dinner");
    }

}
