package thirdpackage;

import java.util.Scanner;

public class UsingMethods11 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a text: ");
        String a = x.next();
        if (a.equalsIgnoreCase(UsingMethods10.r(a))){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is NOT palindrome");
        }
    }
}
