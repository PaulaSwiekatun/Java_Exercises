public class ExceptionsExample {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i=0; i <= numbers.length; i++) { // <"=" remove the equals (=) sign so there is no exception.
            System.out.println(numbers[i]);
        }
    }
}
