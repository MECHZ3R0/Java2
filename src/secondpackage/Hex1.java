package secondpackage;

import java.util.Scanner;

public class Hex1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Write something: ");
        String a = x.next();
        int c=0;
        for (int i=0; i<9; i++){
            if (a.charAt(i)=='A'||a.charAt(i)=='B'||a.charAt(i)=='C'||a.charAt(i)=='D'||a.charAt(i)=='E'||a.charAt(i)=='F'){
                System.out.println("It is hexadecimal");
                i=9;
                c=1;
            }
        }
        if (c==0){
            System.out.println("It is not Hexadecimal");
        }
    }
}
