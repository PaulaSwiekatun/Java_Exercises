package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("I open a Chromium browser");
    }

    @Override
    public void findElementBy() {
        System.out.println("Finds element in Chrome browser");
    }
}
