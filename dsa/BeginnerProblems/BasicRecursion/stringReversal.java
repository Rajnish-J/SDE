package dsa.BeginnerProblems.BasicRecursion;

import java.util.ArrayList;

public class stringReversal {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        // your code goes here
        return reverse(0, s);
    }

    private ArrayList<Character> reverse(int i, ArrayList<Character> s) {
        int n = s.size();
        if (i >= n / 2) {
            return s;
        }
        int right = n - i - 1;
        Character temp = s.get(i);
        s.set(i, s.get(right));
        s.set(right, temp);
        return reverse(i + 1, s);
    }
}
