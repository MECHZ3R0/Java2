package firstpackage;

import java.util.Scanner;

public class EightQuestion {
    public static void main (String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Name:");
        String s1 = a.nextLine();
        System.out.println("Age:");
        int s2 = a.nextInt();
        System.out.println("Weight:");
        float s3 = a.nextFloat();
        System.out.println("Hair Color:");
        String s4 = a.next();

        System.out.format("Name: %s\n",s1);
        System.out.format("Age: %d\n",s2);
        System.out.format("Weight: %.1f\n",s3);
        System.out.format("Hair Color: %s\n",s4);
    }
}
