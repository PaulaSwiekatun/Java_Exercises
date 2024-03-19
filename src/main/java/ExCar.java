public class ExCar {
    public String carBrand;
    public Object yearOfProduction;
    public String carModel;
    public int carMileage;

    public void go() {
        System.out.println("Go!");
    }

    public void stop() {
        System.out.println("STOP!");
    }
    public void information() {
        System.out.println("car brand" + carBrand);
        System.out.println("car model" + carModel);
        System.out.println("Year of production" + yearOfProduction);
        System.out.println("car mileage" + carMileage);
    }

}