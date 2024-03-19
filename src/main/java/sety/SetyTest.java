package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("watermelon");
        fruits.add("banana");


        System.out.println(fruits.contains("banana"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("Carrot");
        vege.addAll(fruits);

        System.out.println(vege.size());

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
