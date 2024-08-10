package simple_problems;

import java.util.Scanner;

public class GcD {
    int whatIsGCD(int A, int B) {
        int gcd = 1;
        for (int i = 1; i <= A && i <= B; i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    int whatIsGCDWhile(int A, int B) {
        while (A != B) {
            if (A > B) {
                A = A - B;
            } else if (A < B) {
                B = B - A;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr First number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        GcD x = new GcD();

        System.out.println("GCD of A: " + num1 + " and B: " + num2 + " is :" + x.whatIsGCDWhile(num1, num2));

        sc.close();

    }
}
