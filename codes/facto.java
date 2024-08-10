package codes;

import java.util.Scanner;

class facto {
    public int factos(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) {
            f *= i;
        }

        return f;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        facto s = new facto();
        if (n == 0) {
            System.out.println(1);
        } else if (n < 0) {
            System.out.println("Error");
        } else {

            System.out.println(s.factos(n));
        }

    }
}