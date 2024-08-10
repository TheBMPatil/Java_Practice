package simple_problems;

import java.util.Scanner;

public class aToPowerB {
    void AtoPowerB(int A, int B) {
        int result = 1;
        for (int i = 1; i <= B; i++) {
            result *= A;
        }
        System.out.println("A to power B  is = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int A = sc.nextInt();
        int B = sc.nextInt();
        aToPowerB a = new aToPowerB();
        a.AtoPowerB(A, B);

        sc.close();
    }
}
