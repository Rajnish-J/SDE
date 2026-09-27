public class isPalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int reversedNumber = 0;
        int originalNumber = n;
        if (n < 0) {
            n = Math.abs(n);
        }
        while (n > 0) {
            int lastNumber = n % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            n = n / 10;
        }
        System.out.println(originalNumber == reversedNumber ? true : false);
    }
}
