package firstpackage;

import java.util.Scanner;

public class Question23d {
    public static void main(String[] args) {
        System.out.println("Choose the car model (X/Y):");
        Scanner x = new Scanner(System.in);
        String m = x.nextLine();
        switch (m) {
            case "X":
                int mxmsrp = 30000;
                System.out.println("Do you want the body package? (Y/N):");
                String bp = x.nextLine();
                if (bp.equalsIgnoreCase("Y")) {
                    mxmsrp = mxmsrp + 5000;
                }
                System.out.println("Do you want the sound package? (Y/N):");
                String sp = x.nextLine();
                if (sp.equalsIgnoreCase("Y")) {
                    mxmsrp = mxmsrp + 3000;
                }
                System.out.println("Your total is " + mxmsrp);
            case "Y":
                int mymsrp = 35000;
                System.out.println("Do you want the entertainment package? (Y/N):");
                String ep = x.nextLine();
                if (ep.equalsIgnoreCase("Y")) {
                    mymsrp = mymsrp + 8000;
                }
                System.out.println("Do you want the safety package? (Y/N):");
                String sfp = x.nextLine();
                if (sfp.equalsIgnoreCase("Y")) {
                    mymsrp = mymsrp + 4000;
                }
                System.out.println("Your total is " + mymsrp);
            default:
                System.out.println("Unknown car model detected");
        }
    }
}
