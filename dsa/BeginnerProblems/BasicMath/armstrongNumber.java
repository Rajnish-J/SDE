public class armstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int originalNumber = n;
        int lengthOfTheNumber = counter(n);
        long sum = 0;
        boolean isArmstrongNumber = false;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + power(lastDigit, lengthOfTheNumber);
            n /= 10;
        }
        if (originalNumber == sum) {
            isArmstrongNumber = true;
        }
        System.out.println(isArmstrongNumber ? true : false);
    }

    public static int counter(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        number = Math.abs(number);
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static long power(int n, int pow) {
        long poweredNumber = 1;
        while (pow > 0) {
            poweredNumber *= n;
            pow--;
        }
        return poweredNumber;
    }
}
