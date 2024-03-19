public class ExCarTest {
    public static void main(String[] args) {

        ExCar mercedes = new ExCar();
        mercedes.carBrand = " Mercedes";
        mercedes.carModel = " Class S";
        mercedes.yearOfProduction = 2023;
        mercedes.carMileage = 1000;

        mercedes.go();
        mercedes.stop();
        mercedes.information();

        ExCar audi = new ExCar();
        audi.carBrand = " Audi";
        audi.carModel = " A5";
        audi.yearOfProduction = " 2024";
        audi.carMileage = 0;

        audi.go();
        audi.stop();
        audi.information();


        ExCar noName = new ExCar();

        noName.go();
        noName.stop();
        noName.information();

    }
}
