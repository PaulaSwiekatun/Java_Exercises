package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Cezarek");
        students.put(2, "Kamela");
        students.put(3, "Kuba");
        students.put(4, "Tosia");
        students.put(1, "Nina");

        System.out.println(students.get(2));   // dodawanie elementow.
        System.out.println(students.get(1));  // Dodają element z takim samem kluczem to wartość z niego zostanie nadpisana.

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);
        System.out.println(students);


        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Tosia"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());


        students.remove(3);  // usuwanie
        System.out.println(students.size());


        for(Integer key : students.keySet()) {
            System.out.println(key);
            System.out.println(students.get(key));
        }

        for (String student : students.values()) {
            System.out.println(student);
        }
    }
}
