package simple_problems;

import java.util.Scanner;

public class avgOf3Nums {
    int avgofnums(int A, int B, int C) {
        return (A + B + C) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avgOf3Nums avg = new avgOf3Nums();
        System.out.println("The avarage of entered numbers is :" + avg.avgofnums(a, b, c));
        sc.close();

    }
}
