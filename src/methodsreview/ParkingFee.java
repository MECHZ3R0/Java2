package methodsreview;

import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Are you a member? (Member/Not Member): ");
        String member=x.nextLine();
        System.out.print("How many hours?: ");
        int hour=x.nextInt();
        parkfee(member,hour);
    }
    public static void parkfee(String member, int hour){
        if (member.equalsIgnoreCase("member")){
            System.out.println("No fee");
        }
        else if (member.equalsIgnoreCase("not member")){
            if (hour>=1&&hour<=2){
                System.out.println("Fee: $3");
            }
            else if (hour>=3&&hour<=6){
                System.out.println("Fee: $5");
            }
            else if (hour>=7&&hour<=12){
                System.out.println("Fee: $10");
            }
            else if (hour>12){
                System.out.println("Fee: $15");
            }
            else {
                System.out.println("Error");
            }
        }
        else {
            System.out.println("Error");
        }
    }
}
