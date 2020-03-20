package secondpackage;

import java.util.Scanner;

public class Hex5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Write something: ");
        String a = x.nextLine();
        for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i)>=65&&a.charAt(i)<=90) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(a.charAt(i));
                }
        }
    }
}