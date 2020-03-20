package firstpackage;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Please enter a grade:");
        int grade = x.nextInt();
        if ((grade>=0)&&(grade<50)){
            System.out.println("F");
        }
        else if ((grade>=50)&&(grade<60)){
            System.out.println("D");
        }
        else if ((grade>=60)&&(grade<70)){
            System.out.println("C");
        }
        else if ((grade>=70)&&(grade<80)){
            System.out.println("B");
        }
        else if ((grade>=80)&&(grade<90)){
            System.out.println("A");
        }
        else if ((grade>=90)&&(grade<100)){
            System.out.println("A+");
        }
        else {
            System.out.println("Grade should be between 0 and 100");
        }

    }
}