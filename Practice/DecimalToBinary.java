import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        if (decimal < 0) {
            System.out.println("Error: Decimal number cannot be negative.");
            return;
        }

        String binary = "";

        // Handle edge case of decimal 0
        if (decimal == 0) {
            binary = "0";
        } else {
            // Efficient conversion using bitwise operations
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary = remainder + binary;
                decimal /= 2;
            }
        }

        System.out.println("Binary equivalent: " + binary);
    }
}
