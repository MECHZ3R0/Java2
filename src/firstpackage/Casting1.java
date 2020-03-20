package firstpackage;

public class Casting1 {
    public static void main(String[] args) {
        int n = 300;
        byte m = (byte) n;
        System.out.println(n+"\n"+m);
        double a = 2.123456789101112131415;
        float b = (float) a;
        System.out.println(a+"\n"+b);
        String c = "Hello";
        //char d = (char) c; ==> not possible because primitive(char) and non-primitive(string) aren't compatible.
        //System.out.println(c+"\n"+d);
    }
}
