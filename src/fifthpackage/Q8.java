package fifthpackage;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String something;
        do {
            System.out.print("Say something: ");
            something = scan.nextLine();
            if (!something.equalsIgnoreCase("you won")) {
                System.out.println("You said " + something);
            }
        } while (!something.equalsIgnoreCase("you won"));
        System.out.println("I knew I will win");
    }
}
