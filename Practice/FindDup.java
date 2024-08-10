import java.util.Scanner;

public class FindDup {
    // Function to find the duplicate number using Floyd's Tortoise and Hare
    // algorithm
    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Find the intersection point of the two pointers
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Phase 2: Find the entrance to the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Size of the array
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt(); // Input array elements
            }

            int result = findDuplicate(arr);
            System.out.println(result);
        }
        scanner.close();
    }
}
