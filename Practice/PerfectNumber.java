public class PerfectNumber {
    /*
     * In mathematics, a **perfect number** is a positive integer that is **equal to
     * the sum of its positive divisors (excluding itself)**. Here's a breakdown:
     ** 
     * Definition:**
     * 
     * Let **n** be a positive integer.
     * **n** is a perfect number if:
     * 
     * ```
     * n = d1 + d2 + ... + dn
     * ```
     * 
     * where:
     * 
     * **d1, d2, ..., dn** are the **positive divisors of n** (excluding 1 and n
     * itself).
     ** 
     * Examples:**
     * 
     * **6**: Its divisors are 1, 2, 3, and 6. 1 + 2 + 3 = 6, so 6 is a perfect
     * number.
     * **28**: Its divisors are 1, 2, 4, 7, 14, and 28. 1 + 2 + 4 + 7 + 14 = 28, so
     * 28 is a perfect number.
     * **10**: Its divisors are 1, 2, 5, and 10. 1 + 2 + 5 ≠ 10, so 10 is not a
     * perfect number.
     ** 
     * Additional notes:**
     * 
     * Perfect numbers have been studied since ancient times, and their properties
     * continue to fascinate mathematicians.
     * Only a few small perfect numbers are known: 6, 28, 496, 8128, and 33550336.
     * It is not known whether there are infinitely many perfect numbers, or whether
     * any odd perfect numbers exist.
     * 
     * I hope this explanation clarifies what perfect numbers are!
     */
    public static boolean isPerfectNumber(int n) {
        if (n <= 1 || n % 2 != 0) {
            return false; // Perfect numbers must be even and greater than 1
        }

        int sum = 1; // Include 1 as a divisor

        // Iterate up to the square root of n to avoid unnecessary checks
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // Add both divisor and its pair (except for sqrt(n))
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println("Is 6 perfect? " + isPerfectNumber(6));
        System.out.println("Is 8 perfect? " + isPerfectNumber(8));

    }
}
