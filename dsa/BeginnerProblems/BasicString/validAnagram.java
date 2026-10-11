package dsa.BeginnerProblems.BasicString;

import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "listen";

        // ! Brute force approach
        System.out.println(bruteForce(s, t));

        // ! Optimal solution => generally the sorting approach have more time
        // ! complexity of log N
        System.out.println(optimalSolution(s, t));
    }

    public static boolean optimalSolution(String s, String t) {
        boolean result = false;
        // * Creating a freq array to calculate the frequency
        int[] freq = new int[26];

        // * iterating the two string to add and reduce the frequency of the char in the
        // * strings
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }
        // * if all the freq in the array remains 0, it's a perfect Anagram
        for (int count : freq) {
            if (count == 0) {
                result = true;
            }
        }
        return result;
    }

    public static boolean bruteForce(String s, String t) {
        boolean result = false;
        // * if a give two Strings is Anagram the length of the two strings should be
        // equal
        if (s.length() != t.length()) {
            result = true;
        }

        // * and it give two strings should be have same amount of freq of the letters
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            result = true;
        }

        return result;
    }
}
