package dsa.BeginnerProblems.BasicString;

public class findLargestOdd {
    public static void main(String[] args) {
        String s = "01257486";
        int lastOdd = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 != 0) {
                lastOdd = i;
                break;
            }
        }

        if (lastOdd == -1) {
            System.out.println("NO");
        }

        int firstNonZero = 0;

        while (firstNonZero < lastOdd && s.charAt(firstNonZero) == '0') {
            firstNonZero++;
        }
        System.out.println(s.substring(firstNonZero, lastOdd + 1));
    }

}
