package secondpackage;

import java.util.Scanner;

public class Hex2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Write something: ");
        String a = x.next();
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                System.out.println(a.charAt(i));
            }
        }
    }
}
