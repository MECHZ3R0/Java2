package firstpackage;

import java.util.Scanner;

public class NinthQuestion2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        final float PI = 3.14f;
        System.out.println("Enter the Radius:");
        float r = a.nextFloat();
        float p = 2*PI*r;
        System.out.format("Perimeter: %.2f\n",p);
    }
}
