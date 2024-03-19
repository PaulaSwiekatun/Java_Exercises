// Przeciążanie Metod. Dwie metody o tej samej nazwie, ale z różnymi parametrami.
// Method Overloading. Two methods with the same name, but with different parameters.

public class MethodName {

    public void add(int a, int b) {
        System.out.println(a+ b);
    }
    public void add(int a, int b, int c) {
        System.out.println(a+ b + c);
    }
    public void add(int a) {
        System.out.println(a);
    }

    public void add(String a) {
        System.out.println(a);
    }
    public void add() {
        System.out.println(2+1);
    }
}
