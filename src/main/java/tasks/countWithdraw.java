package tasks;

import java.util.HashMap;
import java.util.Map;

// int[] numbers = new int [] {1,2,3,2,5,3}
public class countWithdraw {
    public static void main(String[] args) {
        occurencesCount(new int [] {1,2,3,2,5,3,3});

    }

    public static void occurencesCount(int[] numbers) {
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
            if(occurences.containsKey(numbers[1])) {
                Integer value = occurences.get(numbers[1]);
                occurences.put(numbers[1], value + 1);
            } else {
                occurences.put(numbers[1],1);
            }
            }
        for(Integer key : occurences.keySet()) {
            System.out.println("Number " + key + " occurences " + occurences.get(key));
        }
       // System.out.println("number of elements in the map " + occurences.size());
        }

    }



