public class SwapWithoutTemp {
    public static void swapXor(int a, int b) {
        System.out.println("Swapping using XoR Operation");
        System.out.println("Original Values: A=" + a + " B=" + b);
        a = a ^ b; // Swap values using XOR
        System.out.println("A=" + a);
        b = a ^ b; // Swap again to get the original value of a in b
        System.out.println("B= " + b);
        a = a ^ b; // Swap again to get the original value of b in a
        System.out.println("Swapped Values: A=" + a + " B=" + b);
    }

    public static void swapMath(int a, int b) {
        System.out.println("Swapping Using Math Logic");
        System.out.println("Swapped Values: A=" + a + " B=" + b);
        a = a + b; // Add values to create a temporary sum
        System.out.println("A=" + a);
        b = a - b; // Subtract the original value of b from the sum to get a in b
        System.out.println("B= " + b);
        a = a - b; // Subtract the new value of b from the original sum to get b in a
        System.out.println("Swapped Values: A=" + a + " B=" + b);
    }

    public static void main(String[] args) {
        swapMath(1, 4);
        System.out.println();
        swapXor(6, 8);
    }

}
