package secondpackage;

import java.util.Scanner;

public class Forloops3a {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
//for even numbers
        System.out.print("Starting point (100): ");
        int b = a.nextInt();
        System.out.print("Completion point: (0): ");
        int c = a.nextInt();
        for (int i=b; i>=c; i-=2){
            System.out.println(i);
        }
//for odd numbers
        System.out.print("Starting point (2000): ");
        int d = a.nextInt();
        System.out.print("Completion point (1000): ");
        int e = a.nextInt();
        d=d-1;
        for (int i=d; i>=e; i-=2){
            System.out.println(i);
        }
    }
}
