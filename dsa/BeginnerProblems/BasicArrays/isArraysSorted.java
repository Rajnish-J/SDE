package dsa.BeginnerProblems.BasicArrays;

public class isArraysSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(arraySortedOrNot(arr, arr.length));

    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
}
