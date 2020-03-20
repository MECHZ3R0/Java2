package fifthpackage;

import java.util.Scanner;

public class Q1a {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Please enter your ID: ");
        String id = x.nextLine();
        check(id);
    }
    public static void check(String id){
        boolean regid=false;
        boolean itid =false;
        if (id.equalsIgnoreCase("123")){
            regid=true;
        }
        if(id.equalsIgnoreCase("abc")){
            regid=true;
            itid = true;
        }
        if (regid){
            System.out.print("You may enter the building");
            if (itid){
                System.out.print(" and IT room");
            }
            else {
                System.out.print(" but not the IT room");
            }
        }
        else {
            System.out.println("You cannot enter the building");
        }
    }
}
