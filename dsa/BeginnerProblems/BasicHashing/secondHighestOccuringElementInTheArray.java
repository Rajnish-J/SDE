package dsa.BeginnerProblems.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class secondHighestOccuringElementInTheArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        // * finding the frequency
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // * finding the maximum frequency in the hashmap  
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        // * finding the second maximum frequency in the hashmap 
        int secondMaxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (count > secondMaxFreq && count < maxFreq) {
                secondMaxFreq = count;
            }
        }
        if (secondMaxFreq == 0) {
            System.out.println(-1);
        }
        // * finding the actual element that have second maximum frequency
        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if (secondMaxFreq == count && element < result) {
                result = element;
            }
        }
        System.out.println(result);
    }
}
