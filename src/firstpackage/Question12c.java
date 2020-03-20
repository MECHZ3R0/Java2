package firstpackage;
import java.util.Scanner;
public class Question12c {
    public static void main(String[] args) {
        System.out.println("Enter values for the sides of a triangle to see if you can form a triangle with these values:");
        Scanner a = new Scanner(System.in);
        System.out.print("Side A:");
        int x = a.nextInt();
        System.out.print("Side B:");
        int y = a.nextInt();
        System.out.print("Side C:");
        int z = a.nextInt();
        if (((x+y)>z)&&((x+z)>y)&&((z+y)>x)){
            System.out.println("You can form a triangle!!!"); }
        else {System.out.println("Sorry! You cannot form a triangle!");}

    }
}