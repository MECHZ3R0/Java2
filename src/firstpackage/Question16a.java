package firstpackage;

import java.util.Scanner;

public class Question16a {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Please enter the shape:");
        String z = x.nextLine();
        if (z.compareToIgnoreCase("C")==0){
            System.out.print("Please enter the radius:");
            float r = x.nextFloat();
            System.out.println("The perimeter of circle is "+(2*3.14*r));
        }
        else if (z.compareToIgnoreCase("R")==0){
            System.out.print("Please enter the width:");
            float w = x.nextFloat();
            System.out.print("Please enter the height:");
            float h = x.nextFloat();
            System.out.println("The perimeter of rectangle is "+(2*(w+h)));
        }
        else if (z.compareToIgnoreCase("T")==0){
            System.out.print("Please enter the side1:");
            float s1 = x.nextFloat();
            System.out.print("Please enter the side2:");
            float s2 = x.nextFloat();
            System.out.print("Please enter the side3:");
            float s3 = x.nextFloat();
            System.out.println("The perimeter of triangle is "+(s1+s2+s3));
        }
        else{
            System.out.println("Error");
        }
    }
}
