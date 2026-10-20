package dsa.Arrays.Fundamentals;

public class secondLargestNumber {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 3 };
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        boolean foundSecondLargest = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = nums[i];
                if (secondLargestNumber != Integer.MIN_VALUE) {
                    foundSecondLargest = true;
                }
            } else if (nums[i] < largestNumber) {
                if (!foundSecondLargest || nums[i] > secondLargestNumber) {
                    secondLargestNumber = nums[i];
                    foundSecondLargest = true;
                }
            }
        }
        System.out.println(foundSecondLargest ? secondLargestNumber : -1);
    }
}
