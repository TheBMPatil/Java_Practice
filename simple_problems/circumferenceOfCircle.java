package simple_problems;
import java.util.Scanner;

public class circumferenceOfCircle {
    void circumferenceOfC(Float red) {
        float PI = 3.14f;
        float Cir = 2 * PI * red;

        System.out.println("For the circle of Radious " + red + " circumference is :" + Cir);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radious of circle (can be float) : ");
        float red = sc.nextFloat();

        circumferenceOfCircle c = new circumferenceOfCircle();
        c.circumferenceOfC(red);

        sc.close();

    }
}
