public class PalindromeMath {
  public static boolean isPalindromeMath(int n) {
    if (n < 0 || (n % 10 == 0 && n != 0)) {
      return false; // Negative numbers and numbers ending in 0 (except 0 itself) are not
                    // palindromes
    }

    int reversed = 0;
    while (n > reversed) {
      reversed = reversed * 10 + n % 10;
      n /= 10;
    }

    return (n == reversed || n == reversed / 10);
  }
  public static void main(String[] args) {
    System.out.println("Is 123 a palindrome? " + isPalindromeMath(123)); // False
    System.out.println("Is 121 a palindrome? " + isPalindromeMath(121)); // True
    System.out.println("Is -123 a palindrome? " + isPalindromeMath(-123)); // False
    System.out.println("Is 7 a palindrome? " + isPalindromeMath(7)); // False
  }

}
