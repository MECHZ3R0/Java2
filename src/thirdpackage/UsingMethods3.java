package thirdpackage;

import java.util.Scanner;

public class UsingMethods3 {
    public static void main(String[] args) {
        Scanner x  = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String a = x.next();
        vertical(a);
    }
    public static void vertical(String a){
        for (int i = 0; i<a.length();i++){
            System.out.println(a.charAt(i));
        }
    }
}
