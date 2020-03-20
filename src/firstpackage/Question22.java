package firstpackage;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("What is your computer skill?:");
        String cl = x.next();
        if (cl.equalsIgnoreCase("Java")){
            System.out.println("What is your Java score? (0-100):");
            int sc = x.nextInt();
            if (sc>=80){
                System.out.println("Nice job!");
            }
            else {
                System.out.println("You can do it!");
            }
        }
        else if (cl.equalsIgnoreCase("SQL")){
            System.out.println("What is your Hackerrank score? (0-1000):");
            int sc = x.nextInt();
            if (sc<500){
                System.out.println("Solve more questions");
            }
            else if (sc<800){
                System.out.println("Solve more questions");
            }
            else {
                System.out.println("Perfect!");
            }
        }
        else if (cl.equalsIgnoreCase("ClouD")){
            System.out.println("Do you have certification? (Y/N):");
            String sc = x.next();
            if (sc.equalsIgnoreCase("Y")){
                System.out.println("Huge plus");
            }
            else if (sc.equalsIgnoreCase("N")){
                System.out.println("You should get one");
            }
            else {
                System.out.println("Only Y or N");
            }
        }
        else {
            System.out.println("Unknown class detected");
        }
    }
}
