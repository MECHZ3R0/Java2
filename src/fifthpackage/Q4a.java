package fifthpackage;

import java.util.Scanner;

public class Q4a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Does the animal breath air?");
        String air = scan.nextLine();
        if (air.equalsIgnoreCase("no")){
            System.out.println("Fish");
        }
        else if (air.equalsIgnoreCase("yes")){
            System.out.print("Does the animal lay eggs?");
            String egg = scan.nextLine();
            if (egg.equalsIgnoreCase("yes")){
                System.out.println("Bird");
            }
            else if (egg.equalsIgnoreCase("no")){
                System.out.println("Mammal");
            }
        }
    }
}
