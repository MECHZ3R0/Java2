package fifthpackage;

import java.util.Scanner;

public class Q7a {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = scan.nextLine();
        int counter=0;
        String vowel="";
        for (int i=0;i<sentence.length();i++){
            vowel=""+sentence.charAt(i);
            if (vowel.equalsIgnoreCase("a")||vowel.equalsIgnoreCase("o")||vowel.equalsIgnoreCase("u")||vowel.equalsIgnoreCase("i")||vowel.equalsIgnoreCase("e")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
