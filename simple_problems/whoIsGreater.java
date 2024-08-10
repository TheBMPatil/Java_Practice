package simple_problems;
import java.util.Scanner;

public class whoIsGreater {
    void greaterOfTwo(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("Both are equal!");

        } else if (n1 > n2) {
            System.out.println(n1 + " num1 is greater");
        } else {
            System.out.println(n2 + " Num2 is greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        whoIsGreater wh = new whoIsGreater();
        wh.greaterOfTwo(A, B);
        sc.close();

    }
}
