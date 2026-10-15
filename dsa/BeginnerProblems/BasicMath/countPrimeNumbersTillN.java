public class countPrimeNumbersTillN {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        if (n < 0) {
            sum = -1;
        }
        if (n == 0) {
            sum = 0;
        }
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
