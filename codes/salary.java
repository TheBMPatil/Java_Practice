package codes;

import java.util.Scanner;

public class salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();

        char grade = sc.next().charAt(0);

        double hra = 0.2 * base;
        double da = 0.50 * base;
        double pf = 0.11 * base;
        int allw = 0;
        switch (grade) {
            case 'A':
                allw = 1700;
                break;
            case 'B':
                allw = 1500;
                break;
            default:
                allw = 1300;
                break;
        }

        double totalSalary = base + hra + da + allw - pf;
        int roundedTotalSalary = (int) totalSalary;
        System.out.println(roundedTotalSalary);
    }
}
