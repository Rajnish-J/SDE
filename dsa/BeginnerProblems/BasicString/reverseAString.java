package dsa.BeginnerProblems.BasicString;

import java.util.*;

public class reverseAString {
    public static void main(String[] args) {
        List<Character> s = new ArrayList<Character>();
        String sample = "hello";
        for (int i = 0; i < sample.length(); i++) {
            s.add(sample.charAt(i));
        }
        int n = s.size();
        for (int i = 0; i < n / 2; i++) {
            int right = n - i - 1;
            char temp = s.get(i);
            s.set(i, s.get(right));
            s.set(right, temp);
        }
        System.out.println(s);
    }
}
