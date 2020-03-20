package thirdpackage;

public class UsingMethods13 {
    public static void main(String[] args) {
        removeChar("Hello",'e');
    }
    public static void removeChar(String a, char b){
        char c;
        String d="";
        for (int i=0;i<a.length();i++){
            c = a.charAt(i);
            if (c!=b){
                d=d+a.charAt(i);
            }
        }
        System.out.println(d);
    }
}
