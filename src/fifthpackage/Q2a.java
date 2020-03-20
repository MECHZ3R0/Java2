package fifthpackage;

import java.util.Scanner;

public class Q2a {
    public static void main(String[] args) {
        String username;
        String password;
        int control=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.print("Username: ");
            username = scan.nextLine();
            System.out.print("Password: ");
            password = scan.nextLine();
            control=login(username, password, control);
        }
        while (control<5);
        String message = (control==6)?"Have a wonderful day":"Your account is temporarily inactive. Please try again after 5 minutes";
        System.out.println("\n"+message);
    }
    public static int login(String username, String password, int control){
        if (username.equals("Java")){
            if (password.equals("java")){
                System.out.println("\nWelcome back Mr. Java!!!");
                return control=6;
            }
            else {
                System.out.println("\nWrong Password!!!\n");
                return control+=1;
            }
        }
        else {
            System.out.println("\nAccount with this username was not found!\n");
            return control+=1;
        }
    }
}
