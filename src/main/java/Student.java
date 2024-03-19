public class Student {

    public static String universityName = "Harvard"; // pole statyczne charakterystyczne dla klasy i powiązanym z klasą.

    public String firstName; // te pole są charakterystyczne dla obiektu.
    public String name;
    public String nick;
    public String email;
    public int indexNumber;


    public void introduceYourSelf() {
        System.out.println("My name is " + firstName + " " + name);

    }

    public void logIn() {
        System.out.println("Logs in with " + nick);
    }

    public void specifyIndexNumber() {
        System.out.println("My indext number is : " + indexNumber);

    }

    public void enterEmail() {
        System.out.println("My email is : " + email);
    }

    // methods static
public static void infoUniversity() {
    System.out.println("My university is Harvard");

}




}
