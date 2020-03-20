package thirdpackage;

public class UsingMethods15 {
    public static void main(String[] args) {
        replaceChar("Hello",'o','a');
    }
    public static void replaceChar(String a, char b, char c){
        String d="";
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)==b){d=d+c;}
            else if (a.charAt(i)==c){d=d+b;}
            else {d=d+a.charAt(i);}
        }
        System.out.println(d);
    }
}