package dsa.BeginnerProblems.BasicRecursion;

class Solution {
    public boolean palindromeCheck(String s) {
        // your code goes here
        return checker(0, s);
    }

    public boolean checker(int i, String s) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        int right = n - i - 1;
        if (s.charAt(i) != s.charAt(right)) {
            return false;
        }
        return checker(i + 1, s);
    }
}
