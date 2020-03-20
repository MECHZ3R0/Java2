package firstpackage;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("What is temperature today?:");
        int t = x.nextInt();
        if (t<30){
            System.out.println("Wear a jacket!!!");
        }
        else {
            System.out.println("Wear a hat!!!");
        }
    }
}
