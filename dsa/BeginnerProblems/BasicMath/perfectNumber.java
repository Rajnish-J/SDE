public class perfectNumber {
    public static void main(String[] args) {
        int n = -255;
        boolean isPerfectNumber = true;
        if (n <= 0) {
            isPerfectNumber = false;
        }
        if (n > 5000) {
            isPerfectNumber = false;
        }
        int sum = 1;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum != n) {
            isPerfectNumber = false;
        }
        System.out.println(isPerfectNumber);
    }

}
