package fifthpackage;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String sample = scan.nextLine();
        System.out.println(removespace(sample));;
        System.out.println(getnumbers(sample));
    }
    public static String removespace(String sample){
        String output="";
        String check="";
        for (int i=0;i<sample.length();i++){
            check=""+sample.charAt(i);
            if (!check.equals(" ")){
                output+=check;
            }
        }
        return output;
    }
    public static String getnumbers(String sample){
        String output="";
        String check="";
        boolean isThereANumber=false;
        for (int i=0;i<sample.length();i++){
            check=""+sample.charAt(i);
            isThereANumber=check.equals("1")||check.equals("2")||check.equals("3")||check.equals("4")||check.equals("5")||check.equals("6")||check.equals("7")||check.equals("8")||check.equals("9")||check.equals("0");
            if (isThereANumber){
                output+=check;
            }
        }
        return output;
    }
}
