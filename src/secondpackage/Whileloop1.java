package secondpackage;
import java.util.Scanner;

public class Whileloop1 {
    public static void main(String[] args) {
        int a = 50;
        int i =3;
        Scanner x = new Scanner(System.in);
            while (!(a == 1)) {
                System.out.print("Enter a number");
                int b = x.nextInt();
                if (b > a) {
                    System.out.println("Number is big. Try again.");
                } else if (b < a) {
                    System.out.println("Number is small. Try again.");
                } else {
                    System.out.println("Congratulations!!!");
                    a = 1;
                }
                    System.out.println("You have "+(i-1)+" tries left");
                    if (i==1){
                        a=1;
                    }
                    i--;
                }
            }
}

