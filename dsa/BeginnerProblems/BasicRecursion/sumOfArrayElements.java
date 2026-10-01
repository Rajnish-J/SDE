package dsa.BeginnerProblems.BasicRecursion;

public class sumOfArrayElements {
    public int arraySum(int[] nums) {
        // your code goes here
        return sum(nums, 0);
    }

    private int sum(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        return nums[index] + sum(nums, index + 1);
    }
}
