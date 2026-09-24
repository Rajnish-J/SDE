public class reverseANumber {
    public static void main(String[] args) {
        int number = -18;
        System.out.println("Reversed Number: " + reverse(number));
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        boolean isNegativeNumber = number < 0;
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            number = Math.abs(number);
        }
        while (number > 0) {
            int lastNumber = number % 10;
            // ! for constraints from -2 power 3 t0 2 power 31 
            // Check positive overflow
            // if (reversedNumber > Integer.MAX_VALUE / 10 ||
            //     (reversedNumber == Integer.MAX_VALUE / 10 && lastNumber > 7)) {
            //     return 0;
            // }

            // Check negative overflow
            // if (reversedNumber < Integer.MIN_VALUE / 10 ||
            //     (reversedNumber == Integer.MIN_VALUE / 10 && lastNumber < -8)) {
            //     return 0;
            // }
            reversedNumber = (reversedNumber * 10) + lastNumber;
            number = number / 10;
        }
        if (isNegativeNumber) {
            reversedNumber = -reversedNumber;
        }
        return reversedNumber;
    }
}
