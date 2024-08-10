import java.util.Scanner;

public class factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n <= 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            // Check for overflow before multiplication
            if (result > Long.MAX_VALUE / i) {
                throw new ArithmeticException("Factorial overflow");
            }
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int x = sc.nextInt();
       
        System.out.printf("The Factorial of %d is: %d", x, factorial(x));
    }
}
