package secondpackage;

import java.util.Scanner;

public class Nestedforloops3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        int a = x.nextInt();
        System.out.print("Enter completion value: ");
        int b = x.nextInt();
        System.out.print("Input the text: ");
        String c = x.next();
        for (int i=a;i<b;i++){
            System.out.print(c+"\n");
        }
    }
}
