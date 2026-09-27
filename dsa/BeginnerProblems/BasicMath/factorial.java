public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorialNumber = 1;
        if (n < 0 && n > 10) {
            factorialNumber = 0;
        }
        while (n > 0) {
            factorialNumber = factorialNumber * n;
            n--;
        }
        System.out.println(factorialNumber);
    }
}
