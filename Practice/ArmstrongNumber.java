public class ArmstrongNumber {
    // What is armstrong number ?
    /*
     * An n-digit number is an n1 * (n2 * n3) number, where n1, n2 and n3 are the
     * digits at position
     * of the number. For example: 456 = 4*4*4 + 5*5*5 + 6*6*6 = 7077. So it’s an
     * Armstrong Number
     */
    /*
     * An Armstrong number is a special type of number in mathematics where the sum
     * of its digits raised to the power of the number of digits equals the original
     * number itself. Here's a breakdown:
     ** 
     * Definition:**
     * 
     * Let **n** be a positive integer with **d** digits.
     * An Armstrong number is one where:
     * 
     * ```
     * n = d1^d + d2^d + ... + dn^d
     * ```
     * 
     * where:
     * 
     * **d1, d2, ..., dn** are the individual digits of **n**.
     ** 
     * Examples:**
     * 
     * **153**: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong number)
     * **371**: 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371 (Armstrong number)
     * **12**: 1^2 + 2^2 = 1 + 4 = 5 (Not an Armstrong number)
     ** 
     * Additional notes:**
     * 
     * There are only a few Armstrong numbers with single, double, and triple
     * digits.
     * More Armstrong numbers exist with larger numbers of digits.
     * Armstrong numbers are also known as narcissistic or plenary numbers.
     * 
     * I hope this explanation clarifies what Armstrong numbers are!
     */
    public static boolean isArmstrongNumber(int n) {
        if (n <= 0) {
            return false; // Non-positive numbers cannot be Armstrong numbers
        }

        int originalNumber = n;
        int numberOfDigits = 0;
        int remainder, sum = 0;

        // Count the number of digits efficiently using log
        while (n > 0) {
            numberOfDigits++;
            n /= 10;
        }

        // Calculate sum of digits raised to the power of number of digits
        n = originalNumber;
        while (n > 0) {
            remainder = n % 10;
            sum += Math.pow(remainder, numberOfDigits);
            n /= 10;
        }

        // Return true if sum equals original number, else false
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println("Is 153 an armstrong number? " + isArmstrongNumber(153));
        System.out.println("Is 370 an armstrong number? " + isArmstrongNumber(370));
        System.out.println("Is 12 an armstrong number? " + isArmstrongNumber(12));
    }

}
