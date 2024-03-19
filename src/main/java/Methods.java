//dodawanie cyfr od 0 do 100.
// adding numbers from 0 to 100.

public class Methods {

    public void countResult() {
        System.out.println("I'll count the score right now");
        int result = 0;
        for (int i = 0; i < 100; i ++) {
            result = result + i;
        }
        System.out.println("Result is: " + result);

    }
// jak zwracać wartość z metody.
// How to return a value from a method.

    public int downloadResult() {
        System.out.println("I'll count the score right now");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("result is: " + result);
        return result;

    }

    //Parametry metody
    //Method parameters
    public void countResultParam (int number) {
        System.out.println("number has the value:  " + number);
        System.out.println("I'll count the score right now");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("result is: " + result);

    }

    public int add(int firstNumber, int secondNumber) {
        System.out.println("sum is: " + (firstNumber+secondNumber));
       /* if(firstNumber==0) {
            return 0;
        }*/
     return firstNumber + secondNumber;
    }
}