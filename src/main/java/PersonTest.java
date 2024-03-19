//The task (Inner Classes) the class Teacher and class Footballer expanded the class person.
// Zadanie (dziedziczenie) klasa Nauczyciel i klasa Piłkarz rozszerzała klasę person.

public class PersonTest {
    public static void main(String[] args) {
        SchoolTeacher teacher = new SchoolTeacher("Kuba", 31, "Primary school");
        //teacher.name = "Kuba";
        //teacher.age = 31;

       //teacher.school = "Primary school";
        teacher.sayHello();
        teacher.playBoardGames();
        teacher.eat();
        teacher.teach();


        Footballer footballer = new Footballer("Cezarek", 19, "FC Barcelona");
       //footballer.name = "Cezarek";
       //footballer.age = 19;
        footballer.sayHello();
        footballer.playBoardGames();
        footballer.eat();
       //footballer.footballerClub = "FC Barcelona";
        footballer.playFootbal();





    }
}
