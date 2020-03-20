package firstpackage;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number:");
        int y = x.nextInt();
        if (!(y%2==0)){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
