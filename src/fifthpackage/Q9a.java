package fifthpackage;

import java.util.Scanner;

public class Q9a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String sample = scan.nextLine();
        System.out.println(spacetodash(sample));;
    }
    public static String spacetodash(String sample){
        String output="";
        String check="";
        for (int i=0;i<sample.length();i++){
            check=""+sample.charAt(i);
            if (check.equals(" ")){
                output+="-";
            }
            else {
                output += check;
            }
        }
        return output;
    }
}
