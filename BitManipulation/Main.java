public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 16, 16, 16};
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Third largest element: " + thirdLargest);
    }
    
    public static int findThirdLargest(int[] arr) {
        int n = arr.length;
        
        if (n < 3) {
            System.out.println("Array should have at least three elements.");
            return -1;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        // Finding the first, second, and third largest elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }
        
        return third;
    }
}
