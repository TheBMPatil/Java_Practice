public class HarshadNumber {
    /*
     * Harshad Number in Java:
     * 
     * A Harshad number, also known as a Niven number, is a positive integer that is
     * divisible by the sum of its digits. For example, 145 is a Harshad number
     * because 145 is divisible by 1 + 4 + 5 = 10.
     */

    public static boolean isHarshadNumber(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Harshad number must be positive");
        }

        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {
        int num = 145;
        if (isHarshadNumber(num)) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
}
