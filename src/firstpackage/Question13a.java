package firstpackage;

import java.util.Scanner;

public class Question13a {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a value for age:");
        int age = x.nextInt();
        if (age<0){
            System.out.println("Age cannot be negative");
        }
        else if (age>120){
            System.out.println("Age cannot be more than 120");
        }
        else {
            System.out.println("Age is valid");
        }
    }
}
