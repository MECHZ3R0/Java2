package firstpackage;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Please enter the year:");
        int year = x.nextInt();
        if ((year%4==0)||((year%400==0)&&(!(year%100==0)))){
            System.out.println("It is a Leap Year!!!");
        }
        else {
            System.out.println("It is not a Leap Year!!!");
        }

    }
}