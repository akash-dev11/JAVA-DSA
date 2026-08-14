package Arrays4.Medium;

public class MaxSum_inRotated {
    static int maxSum(int[] arr) {
        int n = arr.length;

        int sum = 0;
        int curr = 0;

        // Total sum and R0
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            curr += i * arr[i];
        }

        int max = curr;

        // Calculate next rotations
        for (int i = 1; i < n; i++) {
            curr = curr + sum - n * arr[n - i];
            max = Math.max(max, curr);
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,1,2};
        System.out.println(maxSum(arr));
    }
}
