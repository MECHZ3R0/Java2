package firstpackage;
import java.util.Scanner;

public class ControlStatement2 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n1 = a.nextInt();
        if (!(0==n1%2))
        {
            System.out.println("Odd");
        }
        if (0==n1%2)
        {
            System.out.println("Even");
        }
    }
}
