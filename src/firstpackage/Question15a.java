package firstpackage;

import java.util.Scanner;

public class Question15a {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("What is your gender?");
        String a = x.nextLine();
        String b = "M";
        String c = "F";
        if (a.equals(b)){
            System.out.println("Male");
        }
        else if (a.equals(c)){
            System.out.println("Female");
        }
        else {
            System.out.println("Error");
        }
    }
}
