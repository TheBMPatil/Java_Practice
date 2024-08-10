package codes;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrayelements : " + num.length);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println( i + " : " + num[i]);
        }
    }
}
