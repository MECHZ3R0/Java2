package fifthpackage;

public class AddingVariables {
    public static void main(String[] args) {
        System.out.println(addInt(3,5));
        System.out.println(addDouble(3.5,5.3));
        System.out.println(addChar('a', 'b'));
        System.out.println(addString("Ab","Cd"));
    }
    public static int addInt(int a, int b){
        return a+b;
    }
    public static double addDouble(double a, double b){
        return a+b;
    }
    public static char addChar(char a, char b){
        int c=a+b;
        return (char)c;
    }
    public static String addString(String a, String b){
        return a+" "+b;
    }
}
