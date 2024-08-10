public class PalindromeNum {
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false; // Negative numbers are not palindromes
        }

        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println("Is the number 123 a palindrome? " + isPalindrome(123));
        System.out.println("Is the number 121 a palindrome? " + isPalindrome(121));
        System.out.println("Is the number -123 a palindrome? " + isPalindrome(-123));
    }

}
