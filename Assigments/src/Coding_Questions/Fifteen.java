package Coding_Questions;

import java.util.HashMap;
import java.util.Map;

public class Fifteen {

    public static void main(String[] args) {
      
        int[] arr = {4, 2, 4, 5, 2, 3, 1, 2, 4, 5};

        
        Map<Integer, Integer> countMap = new HashMap<>();

              for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        System.out.println("Element Occurrences:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}
