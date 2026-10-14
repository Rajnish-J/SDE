package dsa.BeginnerProblems.BasicHashing;

import java.util.*;

public class highestOccuringElementsinTheArray {
    public static void main(String[] args) {
        // * input array
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        // * mapping the freq into HashMap
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // * To find the maximum frequency in the hashmap
        int maxFreq = 0;
        // * To return the result
        int result = Integer.MAX_VALUE;
        // * Iterating each key, value pair in the hashmap
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            // * Getting the key and value in the each iteration
            // * Key
            int element = entry.getKey();

            // * Value
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                result = element;
            } else if (count == maxFreq && element < result) {
                result = element;
            }

        }
        System.out.println(result);
    }
}
