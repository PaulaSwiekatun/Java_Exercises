public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 100;i=i+2) { // wartość początkowa 0, i warunek i mniejsze od 100, i +2
//            System.out.println(i);
//        }

        for (int i=0; i<100; i++) {
           if(i%5==0) {
               System.out.println(i);
           }
        }
    }
}
