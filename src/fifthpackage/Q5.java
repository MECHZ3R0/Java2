package fifthpackage;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Road Tested? (Yes/No): ");
        String road = scan.nextLine();
        if (road.equalsIgnoreCase("no")){
            System.out.println("Do not buy");
        }
        else if (road.equalsIgnoreCase("yes")){
            System.out.print("Mileage? (High/Low): ");
            String mileage = scan.nextLine();
            if (mileage.equalsIgnoreCase("low")){
                System.out.println("Buy");
            }
            else if (mileage.equalsIgnoreCase("high")){
                System.out.print("Age? (Recent/Old): ");
                String age = scan.nextLine();
                if (age.equalsIgnoreCase("old")){
                    System.out.println("Do not buy");
                }
                else if (age.equalsIgnoreCase("recent")){
                    System.out.println("Buy");
                }
                else {
                    System.out.println("Invalid Answer Detected");
                }
            }
            else {
                System.out.println("Invalid Answer Detected");
            }
        }
        else {
            System.out.println("Invalid Answer Detected");
        }
    }
}
