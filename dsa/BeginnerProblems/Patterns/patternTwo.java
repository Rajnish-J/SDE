package dsa.BeginnerProblems.Patterns;

public class patternTwo {
    public static void main(String[] args) {
        int n = 5;
        if (n <= 0 && n > 100) {
            System.out.println(" *");
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
