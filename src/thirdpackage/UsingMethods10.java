package thirdpackage;

import java.util.Scanner;

public class UsingMethods10 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a text: ");
        String a = x.next();
        System.out.println(r(a));
    }
    public static String r(String a){
        String result="";
        for (int i=a.length()-1;i>=0;i--){
            result+=a.charAt(i);
        }
        return result;
    }
}
