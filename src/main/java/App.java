public class App {

    public String  applicationName;
    public App(String applicationName) {
        this.applicationName = applicationName;
    }

    public void appInfo() {
        System.out.println("Running App with name " + applicationName);
    }
}
