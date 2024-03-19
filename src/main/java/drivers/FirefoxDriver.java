package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("I open Firefox browser");
    }

    @Override
    public void findElementBy() {
        System.out.println("Finds element in Firefox browser");
    }
}
