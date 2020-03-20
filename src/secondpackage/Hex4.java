package secondpackage;

import java.util.Scanner;

public class Hex4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Write something: ");
        String a = x.nextLine();
        String b = "abcdefghijklmnopqrstuvwxyz ";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print(a.charAt(i));
                }
            }
        }
    }
}
