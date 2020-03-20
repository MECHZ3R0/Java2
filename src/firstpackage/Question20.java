package firstpackage;
import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Please enter your shirt size in S/M/L:");
        String size = x.next();
        System.out.print("Do you have a membership?(Y/N):");
        String member = x.next();
        if (member.compareToIgnoreCase("Y")==0){
            if(size.compareToIgnoreCase("S")==0){
                System.out.println("$9.99");
            }
            else if(size.compareToIgnoreCase("M")==0){
                System.out.println("$10.99");
            }
            else if(size.compareToIgnoreCase("L")==0){
                System.out.println("$11.99");
            }
            else {
                System.out.println("Sorry. Only S/M/L are allowed.");
            }
        }
        else {
            System.out.println("Sorry. You are required to have membership.");
        }
    }
}
