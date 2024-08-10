import java.util.Scanner;

public class revNum {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static int reverseNumberRecursive(int num) {
        if (num < 0) {
            return -reverseNumberRecursive(-num); // Handle negative numbers
        }
        if (num == 0) {
            return 0; // Base case
        }
        int digit = num % 10;
        return digit * (int) Math.pow(10, (int) Math.log10(num)) + reverseNumberRecursive(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Normal : " + reverseNumber(num));
        System.out.println("Recursive  : " + reverseNumberRecursive(num));
    }
}
