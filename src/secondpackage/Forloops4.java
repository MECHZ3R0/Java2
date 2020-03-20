package secondpackage;

import java.util.Scanner;

public class Forloops4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Please enter the beginning of interval: ");
        int y =x.nextInt();
        System.out.print("Please enter the completion of interval: ");
        int z =x.nextInt();
        for(int i=y; i<z; i=i+5){
            System.out.println(i);
        }
    }
}
