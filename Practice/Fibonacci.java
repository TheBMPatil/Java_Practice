import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        System.out.println("Fibonacci series up to " + num + " terms:");
        printFibonacci(num);
    }

}
