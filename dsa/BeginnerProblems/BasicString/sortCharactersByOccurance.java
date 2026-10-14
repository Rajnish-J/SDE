package dsa.BeginnerProblems.BasicString;

import java.util.*;

public class sortCharactersByOccurance {
    public static void main(String[] args) {
        String s = "tree";
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            freq.put(letter, freq.getOrDefault(letter, 0) + 1);
        }
        System.out.println(freq);
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> {
            int frequencyCompare = Integer.compare(freq.get(a), freq.get(b));
            System.out.println(frequencyCompare);
            if (frequencyCompare != 0) {
                return frequencyCompare;
            }
            System.out.println(Character.compare(a, b));
            return Character.compare(a, b);
        });
        System.out.println(chars);
    }
}
