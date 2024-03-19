/*Zadanie: stworzenie interface WebDriver, który będzie miał dwie metody get() i findElementBy()
Dodaj dwie klasy ChromDriver i FirefoxDriver, które będą implementowały ten interface.*/

/*Task: create a WebDriver interface that will have two methods get() and findElementBy()
Add two classes ChromDriver and FirefoxDriver that will implement this interface.*/


package drivers;

public class WebDriverTest {
    public static void main(String[] args) {

       DriverType[] driverType = DriverType.values();
       for (int i = 0; i<driverType.length; i++) {
           System.out.println(driverType[i].name);
           System.out.println(driverType[i].path);
       }

        WebDriver driver = getDriver(DriverType.CHROME);
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

       /* ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();*/



        /*FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();*/


    }

    private static WebDriver getDriver(DriverType type) {
        if(type==DriverType.CHROME) {
            return new ChromeDriver();
        }
            return new FirefoxDriver();
        }
}

