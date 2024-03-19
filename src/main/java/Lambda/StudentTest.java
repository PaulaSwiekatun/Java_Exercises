package Lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 22);

        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };

        sayHello("Kate", med, 31);

        // (parametr) -> System.out.println("I am not student, My name is " + name);
        
        Student noStudent = (name, age) -> {
            System.out.println("I am not student, My name is " + name + " I am " + age);
            if(age>18) {
                System.out.println("You can go to college");
            }
        };
        sayHello("Tom", noStudent, 21);
    }

   public static void sayHello(String name, Student student, int age) {
        student.sayHello(name, age);
   }
}
