package firstpackage;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("What is your gender?");
        String a = x.nextLine();
        if (a.equals("M")){
            System.out.println("Male");
        }
        else if (a.equals("F")){
            System.out.println("Female");
        }
        else {
            System.out.println("Error");
        }
    }
}
