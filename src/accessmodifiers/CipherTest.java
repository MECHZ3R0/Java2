package accessmodifiers;

import java.util.Scanner;

public class CipherTest {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        Cipher x=new Cipher("hello",3);
        System.out.println("Your sample text is : "+x.getInput());
        System.out.println("Your initial shift number is :"+x.getShift());
        System.out.print("Please enter your text here to encrypt: ");
        String z=y.nextLine();
        x.setInput(z);
        x.cipher();
        System.out.println("Your encrypted text is: "+x.getInput());
        x.decipher();
        System.out.println("Your decrypted text is: "+x.getInput());
    }
}
