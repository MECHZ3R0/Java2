package firstpackage;
import java.util.Scanner;

public class Exp1 {
    public static void main (String[] args){
        System.out.println("Enter a decimal number:");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        float s1 = a.nextFloat();
        float s2 = b.nextFloat();
        float s3 = c.nextFloat();
        System.out.println("Perimeter of Triangle is:");
        System.out.println(s1+s2+s3);
    }
}
