package thirdpackage;

import java.util.Scanner;

public class UsingMethods9 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a text: ");
        String a = x.next();
        int b=a.length()-1;
        r(a,b);
        System.out.println(r(a,b));
    }
    public static String r(String a, int b){
        String result="";
        for (int i=b;i>=0;i--){
            System.out.print(a.charAt(i));
            result+=a.charAt(i);
        }
        System.out.println();
        return result;
    }
}
