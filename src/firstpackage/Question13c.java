package firstpackage;

import java.util.Scanner;

public class Question13c {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the amount of electricity used in kW:");
        float y = 0;
        int t = x.nextInt();
        if (t>0&&t<500){
            y = (float)t*0.3f;
            System.out.format("Your bill is $%.2f",y);
        }
        else if (t>=500&&t<=1000){
            y = (float)t*0.4f;
            System.out.format("Your bill is $%.2f",y);
        }
        else if (t>=1000&&t<=2000){
            y = (float)t*0.5f;
            System.out.format("Your bill is $%.2f",y);
        }
        else if (t>=2000){
            y = (float)t*0.6f;
            System.out.format("Your bill is $%.2f",y);
        }
        else {
            System.out.format("Invalid input detected");
        }
    }
}