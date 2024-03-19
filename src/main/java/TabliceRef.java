// Struktury pozwalające gromadzić większą ilość danych.
// Structures for collecting more data.
public class TabliceRef {
    public static void main(String[] args) {
        String[] winterMonths = new String[3];
        winterMonths[0] = "December";
        winterMonths[1] = "January";
        winterMonths[2] = "February";

        int[] numbers = new int[]{1, 4, 6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(winterMonths.length);

        winterMonths[2] = "March";

        for (int i=0; i < winterMonths.length;i++) {
            System.out.println(winterMonths[i]);
        }
        winterMonths[4] = "March";
    }

}