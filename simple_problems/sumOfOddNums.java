package simple_problems;

import java.util.Scanner;

public class sumOfOddNums {
    int sumOfOdd(int N) {
        int sum = 0;
        if (N <= 0) {
            System.out.println("Invalid number");
        } else {

            for (int i = 1; i < N; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        sumOfOddNums sm = new sumOfOddNums();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number : ");
        int n = sc.nextInt();

        System.out.println("Sum of all the odd numbers from 1 to " + n + " is :" + sm.sumOfOdd(n));
        sc.close();
    }
}
