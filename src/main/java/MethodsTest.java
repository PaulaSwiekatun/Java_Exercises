public class MethodsTest {
    public static void main(String[] args) {
        Methods methods = new Methods();
       /* methods.countTheScore();
        methods.countTheScore(); */
       int result = methods.downloadResult();
       int result2 = result *2;
        System.out.println("the result before multiplication is: " + result);
        System.out.println("the result after multiplication is: " + result2);

        methods.countResultParam(2);
        methods.countResultParam(100);
        methods.countResultParam(23);

        methods.add(2,3);


    }
}
