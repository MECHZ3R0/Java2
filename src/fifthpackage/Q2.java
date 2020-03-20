package fifthpackage;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String username = "Java";
        String password = "java";
        Scanner x=new Scanner(System.in);
        System.out.print("Username: ");
        String u=x.nextLine();
        System.out.print("Password: ");
        String p=x.nextLine();
        System.out.println(login(u,p));
    }
    public static String login(String u, String p){
        if (u.equals("Java")){
            if (p.equals("java")){
                return "Welcome back Mr. Java!!!";
            }
            else {
                return "Wrong Password!!!";
            }
        }
        else {
            return "Account with this username was not found!";
        }
    }
}
