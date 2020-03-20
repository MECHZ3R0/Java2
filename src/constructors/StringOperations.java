package constructors;

import java.util.Arrays;

public class StringOperations {
    String value;
    StringOperations(String value){
        this.value=value;
    }
    String Reversed(){
        String tempvalue="";
        for (int i=0;i<value.length();i++){
            tempvalue+=value.charAt(value.length()-1-i);
        }
        return tempvalue;
    }
    String UpperCaseFirstLetters(){
        String tempvalue="";
        String first=""+value.charAt(0);
        tempvalue+=first.toUpperCase();

        for (int i=1;i<value.length();i++){
            if (value.charAt(i-1)==' ') {
                first=""+value.charAt(i);
                tempvalue+=first.toUpperCase();
            }
            else {
                tempvalue += value.charAt(i);
            }
        }
        return tempvalue;
    }
    char[] SentenceArray(){
        char[] tempvalue=new char[value.length()];
        for (int i=0;i<value.length();i++){
            tempvalue[i]=value.charAt(i);
        }
        return tempvalue;
    }
    String[] StringArray(){
        int count=1;
        for (int i=0; i<value.length();i++){
            if (value.charAt(i)==' '){
                count++;
            }
        }
        String[] tempvalue=new String[count];
            String rowvalue="";
            count=0;
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i)!=' ') {
                    rowvalue += value.charAt(i);
                }
                else {
                tempvalue[count]=rowvalue;
                count++;
                rowvalue="";
                }
            }
        tempvalue[count]=rowvalue;
        return tempvalue;
    }

    public static void main(String[] args) {
        StringOperations a =new StringOperations("hello how are you");
        System.out.println(a.Reversed());
        System.out.println(a.UpperCaseFirstLetters());
        System.out.println(Arrays.toString(a.SentenceArray()));
        System.out.println(Arrays.toString(a.StringArray()));
    }
}
