package dsa.Arrays.Fundamentals;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 3 };
        int target = 3;
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
