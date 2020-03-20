package thirdpackage;

import java.util.Scanner;

public class UsingMethods5 {
    public static void main(String[] args) {
        int a = 10;
        Scanner x=new Scanner(System.in);
        System.out.print("Guess the number: ");
        int b = x.nextInt();
        test(a,b,x);
        System.out.println("You won!");
    }
    public static void test(int a, int b, Scanner x){
        while (a!=b){
            System.out.println("Try Again!");
            clue(a,b);
            System.out.print("Guess the number: ");
            b = x.nextInt();
        }
    }
    public static void clue(int a, int b){
        if (a>b) System.out.println("Your number is small");
        else if (a<b) System.out.println("Your number is big");
    }
}

