package firstpackage;

import java.util.Scanner;

public class NinthQuestion3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter MSRP:");
        float msrp = a.nextFloat();
        System.out.println("Enter Driver Discount(%):");
        float disc = a.nextFloat();
        float dp = (100-disc)/100;
        System.out.println("Enter Down Payment Amount:");
        float down = a.nextFloat();
        System.out.println("How many month?:");
        float month = a.nextFloat();
        float result = (msrp*dp-down)/month;
        System.out.format("Your Monthly Payment is $%.2f\n",result);
    }
}
