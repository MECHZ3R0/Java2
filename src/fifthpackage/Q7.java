package fifthpackage;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = scan.nextLine();
        int counter=0;
        for (int i=0;i<sentence.length();i++){
            if (sentence.charAt(i)=='a'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
