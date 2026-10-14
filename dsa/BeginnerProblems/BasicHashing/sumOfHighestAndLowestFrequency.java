package dsa.BeginnerProblems.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class sumOfHighestAndLowestFrequency {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        // * finding the frequency
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // * finding the maximum frequency in the hashmap
        int maxFreq = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        // * finding the minimum frequency in the hashmap
        int minFreq = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (count < minFreq) {
                minFreq = count;
            }
        }
        // * adding the highest and lowest frequency
        System.out.println(maxFreq + minFreq);
    }
}
