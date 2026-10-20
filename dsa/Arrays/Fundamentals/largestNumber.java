package dsa.Arrays.Fundamentals;

public class largestNumber {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 3 };
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNumber) {
                largestNumber = nums[i];
            }
        }
        System.out.println(largestNumber);
    }
}
