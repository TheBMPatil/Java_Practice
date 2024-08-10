import java.util.Scanner;

public class TMiddleFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int middleNumber = findMiddleNumber(num1, num2, num3);

        System.out.println("The middle number is: " + middleNumber);
    }

    private static int findMiddleNumber(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num2 > num3) return num2;
            if (num1 < num3) return num1;
            return num3;
        }

        if (num2 > num3) return num2;
        if (num1 < num3) return num1;
        return num3;
    }
}