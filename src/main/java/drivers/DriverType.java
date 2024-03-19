package drivers;

public enum DriverType {
    CHROME("chrome", "/src/resurces/chromedriver.exe"),
    FIREFOX("firefox", "/src/resurces/firefox.exe");

    String name;
    String path;

    DriverType(String name, String path) {
       this.name = path;
       this.path = path;
    }

}
