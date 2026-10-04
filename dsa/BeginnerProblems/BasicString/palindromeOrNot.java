package dsa.BeginnerProblems.BasicString;

public class palindromeOrNot {
    public static void main(String[] args) {
        String s = "madam";
        int n = s.length();
        boolean checker = true;
        for (int i = 0; i <= n / 2; i++) {
            int right = n - i - 1;
            if (s.charAt(i) != s.charAt(right)) {
                checker = false;
                break;
            }
        }
        System.out.println(checker);
    }
}
