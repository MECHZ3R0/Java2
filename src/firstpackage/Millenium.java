package firstpackage;

import java.util.Scanner;

public class Millenium {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = x.nextInt();
            if (year>1999){
                System.out.println("After Millennium");
            }
            else {
                System.out.println("Before Millennium");
            }
    }
}
