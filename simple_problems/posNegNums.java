package simple_problems;

import java.util.Scanner;

public class posNegNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        while (true) {
            System.out.print("Enter a number (or type 'exit' to finish): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or type 'exit' to finish.");
            }
        }

        System.out.println("Count of Positive Numbers: " + positiveCount);
        System.out.println("Count of Negative Numbers: " + negativeCount);
        System.out.println("Count of Zeros: " + zeroCount);
        sc.close();
    }

}
