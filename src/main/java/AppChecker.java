/*Zadanie: stwórz klase bazową App- zawierającą pole name i metode appInfo,
dodaj konstruktor do którego przekażesz wartość name.
Stwórz klasy potomne AndroidApp i IphoneApp - zawiera metode runAndroidApp / run runIphoneApp

 /*Task: create an App- base class containing the name field and the appInfo
  method, add a constructor to which you pass the name value.
  Create descendant classes AndroidApp and IphoneApp - contains method runAndroidApp / runIphoneApp
 */

public class AppChecker {

    public static void main(String[] args) {
        AndroitApp android = new AndroitApp("Calculator");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Calculator");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();


    }
}
