package thirdpackage;

import java.util.Scanner;

public class UsingMethods2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String a = x.next();
        if (isTherePassword(a)){
            check(a);}
        else {
            System.out.println("Please enter a password");
        }
    }
    public static void check(String a){
        if (a.length()<=6){
            System.out.println("Weak Password");
        }
        else{
            System.out.println("Strong Password");
        }
    }
    public static boolean isTherePassword(String a){
        boolean q;
        q= a.length() >= 1;
        return q;
    }
}
