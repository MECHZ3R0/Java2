package firstpackage;

import java.util.Scanner;

public class Question14a {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your age:");
        float a = x.nextFloat();
        System.out.print("Enter your Java points:");
        float b = x.nextFloat();
        if((a>19&&a<30)&&(b>=80)){
            System.out.println("Your total points are "+(a*1.5+b*4.5));
        }
        else if((a>19&&a<30)&&(b<80)){
            System.out.println("Your total points are "+(a*1.5+b*3.5));
        }
        else if((a>31)&&(b>=80)){
            System.out.println("Your total points are "+(a*1.1+b*4.5));
        }
        else if((a>31)&&(b<80)){
            System.out.println("Your total points are "+(a*1.1+b*3.5));
        }
        else {
            System.out.println("No information!!!");
        }
    }
}
