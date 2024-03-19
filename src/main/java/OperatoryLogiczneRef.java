public class OperatoryLogiczneRef {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue);     // i, and
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || fourthValue);    // lub, or
        System.out.println(!firstValue);                   // zaprzeczenie, denial (negation)
        System.out.println(!secondValue);
        System.out.println(!(firstValue && secondValue));
    }
}
