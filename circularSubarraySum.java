import java.util.Scanner;
class  circularSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, -4, 3, -5, 4};

        int maxSum = arr[0];
        int currentMax = arr[0];

        int minSum = arr[0];
        int currentMin = arr[0];

        int totalSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSum = Math.min(minSum, currentMin);

            totalSum += arr[i];
        }
        int result;
        if (maxSum < 0) {
            result = maxSum;
        } else {
            result = Math.max(maxSum, totalSum - minSum);
        }

        System.out.println("Maximum Circular Subarray Sum = " + result);
    }
}