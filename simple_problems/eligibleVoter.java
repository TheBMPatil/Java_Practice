package simple_problems;
import java.util.Scanner;

public class eligibleVoter {
    void eligibleOrNot(int Age) {
        if (Age <= 0) {
            System.out.println("Invalid Age");
        } else if (Age > 18) {
            System.out.println("Person is eligible for Voting");

        } else {
            System.out.println("Person is not eligible for voting.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of a person");
        int age = sc.nextInt();
        eligibleVoter P = new eligibleVoter();

        P.eligibleOrNot(age);

        sc.close();

    }
}
