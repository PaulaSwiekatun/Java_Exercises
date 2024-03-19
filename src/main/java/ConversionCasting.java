// Konwersja i rzutowanie typów.
// Type Conversion and Casting.


import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b;  // a zostaje przekonwertowana na double. // a is converted to double.

        int d = a/(int) b;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver)driver;
        firefoxDriver.get();
    }
}
