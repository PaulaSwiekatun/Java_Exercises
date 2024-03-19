public class ExSwitch {
    public static void main(String[] args) {

        String dish = "Pizza";

        switch (dish) {
            case "Pizza":
                System.out.println("Price is $25");
                break;
            case "Hamburger":
                System.out.println("Price is $15");
                break;
            case "Salad":
            System.out.println("Price is $12");
                break;
            default:
                System.out.println("Sorry, no such dish in our restaurant");
        }
    }
}
