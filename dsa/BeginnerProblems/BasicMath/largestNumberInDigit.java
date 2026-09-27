public class largestNumberInDigit {
    public static void main(String[] args) {
        int n = 18;
        int largestNumber = 0;
        if (n == 0) {
            largestNumber = 0;
        }
        if (n < 1 && n > 5000) {
            largestNumber = -1;
        }
        while (n > 0) {
            int lastNumber = n % 10;
            n /= 10;
            if (lastNumber > largestNumber) {
                largestNumber = lastNumber;
            }
        }
        System.out.println(largestNumber);
    }
}
