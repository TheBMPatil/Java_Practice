import java.util.Scanner;

public class FizzBar {
    public String output(int num) {
        String op = " ";
        if (num % 11 == 0 && num % 29 == 0) {
            op = "Foo Bar";
        } else if (num % 11 == 0) {
            op = "Foo";
        } else if (num % 29 == 0) {
            op = "Bar";
        } else {
            op = "Not divisible by 11 or 29";
        }

        return op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FizzBar F = new FizzBar();
        int N = sc.nextInt();
        System.out.println(F.output(N));

    }
}
