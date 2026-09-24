public class countOddNumbersInaDigit {
    public static void main(String[] args) {
        int number = 7789;
        System.out.println("Count of the odd number :" + oddCounter(number));
    }

    public static int oddCounter(int number) {
        int count = 0;
        if (number == 0) {
            count = 0;
        }
        if (number < 0) {
            number = Math.abs(number);
        }
        while (number > 0) {
            int tempVariable = number % 10;
            if (tempVariable % 2 != 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
