public class PetlaForRef {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(2);
        System.out.println(4);

        int number = 100;
        // i specjalna zmienna sterująca
        for (int i =0; i < number;i=i+2) {
            System.out.println(i);
        }

        // i specjalna zmienna sterujaca
        for (int i =0; i < number;i++) {
             if(i%5==0)
            System.out.println(i);
        }

        for (int j=0;j<number;j++) {
            System.out.println("Będę codziennie uczyć się programowania w Java");
        }
    }
}
