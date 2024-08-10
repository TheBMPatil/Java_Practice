public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Year must be positive");
        }

        if (year % 100 == 0) {
            // Century year must be divisible by 400 to be a leap year
            return year % 400 == 0;
        } else {
            // Regular year must be divisible by 4 to be a leap year
            return year % 4 == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2004)); // true
    }
}
