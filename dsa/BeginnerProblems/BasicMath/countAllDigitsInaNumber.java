public class countAllDigitsInaNumber {
    public static void main(String[] args) {
        int number = 7789;
        System.out.println("Count of the number :" + counter(number));
    }

    public static int counter(int number) {
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        if (number < 0) {
            number = Math.abs(number);
        }
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}