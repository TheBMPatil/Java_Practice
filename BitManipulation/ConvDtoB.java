//How to convert Decimal to binary in java

import java.util.Scanner;

public class ConvDtoB {

    public static void main(String[] args) {
        System.out.println("Enter a decimal number:");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        System.out.println("The decimal number " + dec + " is equal to the binary representation: ");
        System.out.println(printBinary(dec));
    }

    /* This method prints the binary representation of a given decimal number */
    private static String printBinary(int n) {
        String res = "";
        while (n != 1) {
            if (n % 2 == 1) {
                res += "1";

            } else {
                res += "0";

            }
            n = n / 2;
        }
        StringBuffer sbr = new StringBuffer(res);
        sbr.reverse();
        System.out.println(sbr.toString());
        return sbr.toString();

    }
}