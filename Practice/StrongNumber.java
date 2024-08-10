public class StrongNumber {

    // A strong number, also known as a Harshad number, is a positive integer where
    // the **sum of the factorials of its digits** is equal to the original number
    // itself. Here's a breakdown:

    // **Definition:**

    // * Let **n** be a positive integer with **d** digits.
    // * **n** is a strong number if:

    // ```
    // n = d1! + d2! + ... + dn!
    // ```

    // where:

    // * **d1, d2, ..., dn** are the individual digits of **n**.
    // * **!** represents the factorial operation (e.g., 5! = 5 * 4 * 3 * 2 * 1).

    // **Examples:**

    // * **145**: 1! + 4! + 5! = 1 + 24 + 120 = 145 (Strong number)
    // * **40585**: 4! + 0! + 5! + 8! + 5! = 24 + 1 + 120 + 40320 + 120 = 40585
    // (Strong number)
    // * **12**: 1! + 2! = 1 + 2 = 3 (Not a strong number)

    // **Additional notes:**

    // * There are only a few strong numbers with single, double, and triple digits.
    // * More strong numbers exist with larger numbers of digits.
    // * Strong numbers are also known as harshad numbers or narcissistic numbers.

    // I hope this explanation clarifies what strong numbers are!

    public static boolean isStrongNumber(int n) {
        if (n <= 0) {
            return false; // Non-positive numbers cannot be strong numbers
        }

        int originalNumber = n;
        int sum = 0;

        // Calculate sum of factorials of each digit
        while (n > 0) {
            int digit = n % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            n /= 10;
        }

        // Return true if sum equals original number, else false
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println("Is the number 1634 " + (isStrongNumber(1634) ? "" : "not ") + "a strong number");
        System.out.println("Is the number 5 " + (isStrongNumber(5) ? "" : "not ") + "a strong number");
        System.out.println("Is the number -7 " + (isStrongNumber(-7) ? "" : "not ") + "a strong number");

    }

}
