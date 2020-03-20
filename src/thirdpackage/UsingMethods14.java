package thirdpackage;

public class UsingMethods14 {
    public static void main(String[] args) {
        returnString("Hello",1,3);
    }
    public static void returnString(String a, int b, int c){
        String d="";
        for (int i=0;i<a.length();i++){
            if ((i+1)==b){}
            else if ((i+1)==c){}
            else {d=d+a.charAt(i);}
        }
        System.out.println(d);
    }
}