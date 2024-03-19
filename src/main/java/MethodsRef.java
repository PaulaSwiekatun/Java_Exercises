// blok który zaiwra jakieś instrukcje.
// może być uruchomiony (wywoływany) poprzez odwołanie się do jej nazwy().

// a block that contains some instruction.
// can be run (called) by invoking its name().
public class MethodsRef {

    public void names(){
    int result = 0;
    for(int i=0; i<100; i++) {
        result = result +1;
    }
        System.out.println("Value is : " + result);
    }

    public void sum() {
        int firstNumber = 0;
        int secondNumber = 2;
        System.out.println("Sum is : " + (firstNumber+secondNumber));
    }

    public String name() {
        System.out.println("My name is Paula");
        return "Paula";
    }
}
