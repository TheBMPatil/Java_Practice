import java.util.*;
import java.io.*;

class simpInt {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        float SI = amount * rate * time / 100;
        System.out.print((int)SI);
        sc.close();
    }
}