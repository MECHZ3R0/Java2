package thirdpackage;

import java.util.Scanner;

public class UsingMethods12 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a text: ");
        String a = x.next();
        if(isSame(a)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    public static boolean isSame(String a){
        boolean q=true;
        for (int i=0;i<a.length()/2;i++){
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                q = false;
                break;
            }
        }
        return q;
    }
}

