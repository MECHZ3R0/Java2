package thirdpackage;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menudisplay.display();
        Scanner x= new Scanner(System.in);
        System.out.println("What do you want from Soups Menu?: ");
        String a = x.nextLine();
        System.out.println("What do you want from Meals Menu?: ");
        String b = x.nextLine();
        System.out.println("What do you want from Salads Menu?: ");
        String c = x.nextLine();
        System.out.format("Your total is %.3f",Menureceive.receipt(a,b,c));
    }
}
