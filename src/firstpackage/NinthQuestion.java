package firstpackage;
import java.util.Scanner;
public class NinthQuestion {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Side1:");
        float l1 = a.nextFloat();
        System.out.println("Enter Side2:");
        float l2 = a.nextFloat();
        float p = 2*(l1+l2);
        float ar = l1*l2;
        System.out.format("Perimeter: %.2f\n",p);
        System.out.format("Area: %.2f\n",ar);
    }
}
