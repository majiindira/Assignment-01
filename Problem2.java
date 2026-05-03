import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Sort array
        Arrays.sort(arr);

        // Take median
        int target = arr[n / 2];

        int operations = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - target);

            // Check if possible
            if (diff % k != 0) {
                System.out.println(-1);
                return;
            }

            operations += diff / k;
        }

        System.out.println(operations);
    }
}

