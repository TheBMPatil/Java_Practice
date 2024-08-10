import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number whose dig sum is needed: ");
        int num = sc.nextInt();
        System.out.println("Sum of dig is :" + sumOfDigits(num));
    }

}
