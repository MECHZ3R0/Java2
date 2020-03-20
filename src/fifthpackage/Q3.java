package fifthpackage;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination;
        do {
            System.out.println();
            System.out.print("Please enter your destination: ");
            destination = scan.nextLine();
            gate(destination);
        }
        while (!destination.equalsIgnoreCase("exit"));
        System.out.println("Have a good day!!!");
    }
    public static void gate(String destination){
            String destinationcontrol = destination.toLowerCase();
            switch (destinationcontrol) {
                case "europe":
                    System.out.println("Please go to GATE A.");
                    break;
                case "africa":
                    System.out.println("Please go to GATE B.");
                    break;
                case "asia":
                    System.out.println("Please go to GATE C.");
                    break;
                case "america":
                    System.out.println("Please go to GATE D.");
                    break;
                default:
                    if (!destination.equalsIgnoreCase("exit")){
                        System.out.println("Please enter a correct destination.");
                    }
                    break;
            }
    }
}
