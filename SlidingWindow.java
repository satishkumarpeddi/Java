import java.util.*;
public class SlidingWindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        // sum first window
        for (int i = 0; i < K; i++)
            windowSum += arr[i];
        maxSum = windowSum;

        // slide window
        for (int i = K; i < N; i++) {
            windowSum += arr[i] - arr[i - K];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }

}
