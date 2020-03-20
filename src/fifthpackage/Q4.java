package fifthpackage;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Does the animal breath air?");
        String air = scan.nextLine();
        System.out.print("Does the animal lay eggs?");
        String egg = scan.nextLine();
        System.out.println(answer(air, egg));
    }
    public static String answer(String air, String egg){
        boolean air1=false;
        boolean egg1=false;
        String answer="";
        if (air.equalsIgnoreCase("yes")){
            air1=true;
        }
        if (egg.equalsIgnoreCase("yes")){
            egg1=true;
        }
        if (air1&&egg1){
            answer= "Bird";
        }
        if (!air1&&!egg1){
            answer= "Unknown Species";
        }
        if (!air1&&egg1){
            answer= "Fish";
        }
        if (air1&&!egg1){
            answer="Mammal";
        }
        return answer;
    }
}
