package firstpackage;

import java.util.Scanner;

public class Question13b {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int t = x.nextInt();
        if (t<20){
            System.out.println("Winter");
        }
        else if (t>20&&t<41){
            System.out.println("Fall");
        }
        else if (t>40&&t<61){
            System.out.println("Spring");
        }
        else {
            System.out.println("Summer");
        }
    }
}
