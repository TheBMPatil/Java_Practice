import java.util.Scanner;

public class midFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three nums");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        if ((X > Y && Y > Z) && (Z > Y && Y > X)) {
            System.out.println("The middle number is " + Y);

        } else if ((Z > X && X > Y) && (Y > X && X > Z)) {
            System.out.println("The middle number is " + X);
        } else {
            System.out.println("The middle number is " + Z);
        }

    }
}
