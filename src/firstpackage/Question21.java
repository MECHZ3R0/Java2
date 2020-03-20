package firstpackage;
import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Are you subscribed? (Y/N):");
        String sub = x.next();
        if (sub.compareToIgnoreCase("Y")==0){
            System.out.print("What is your usage?:");
            int usage = x.nextInt();
            if(usage>=0&&usage<=100){
                System.out.println("10 USD");
            }
            else if(usage>=100){
                System.out.println("40 USD");
            }
            else {
                System.out.println("No data found!!!");
            }
        }
        else if (sub.compareToIgnoreCase("N")==0){
            System.out.println("Sorry. Subscription required. Please visit subscription page.");
        }
        else {
            System.out.println("Check your answer again.");
        }
    }
}
