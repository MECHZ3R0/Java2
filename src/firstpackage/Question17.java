package firstpackage;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        int y = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("Please choose Red or Blue:");
        String color = x.nextLine();
        if (color.compareToIgnoreCase("Red")==0){
            y = 20;
            System.out.print("What is the Price Tag:");
            float price = x.nextFloat();
            System.out.print("How much is Discount:");
            float disc = x.nextFloat();
            float point = price + disc - y;
            if (point>=100){
                System.out.println("Do not buy");
            }
            else if (point>=50&&point<=99){
                System.out.println("Buy later");
            }
            else if (point<500){
                System.out.println("Buy now");
            }
            else{
                System.out.println("Error");
            }
        }
        else if (color.compareToIgnoreCase("Blue")==0){
            y = 10;
            System.out.print("What is the Price Tag:");
            float price = x.nextFloat();
            System.out.print("How much is Discount:");
            float disc = x.nextFloat();
            float point = price + disc - y;
            if (point>=100){
                System.out.println("Do not buy");
            }
            else if (point>=50&&point<=99){
                System.out.println("Buy later");
            }
            else if (point<500){
                System.out.println("Buy now");
            }
            else{
                System.out.println("Error");
            }
        }
        else {
            System.out.println("Color not found!!!");
        }
}}
