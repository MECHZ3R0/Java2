package secondpackage;

public class Methods3 {
    public static void main(String[] args) {
        multipleHelloWorlds(10);
        int a = addTwoNumbers(3,2);
        int b= subtractTwoNumbers(3,2);
        int c= multiplyTwoNumbers(3,2);
        float d= divideTwoNumbers(3,2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void multipleHelloWorlds(int x){
        for (int i=0;i<x;i++){
            System.out.println("Hello World");
        }
    }
    public static int addTwoNumbers(int y, int z){
        return y+z;
    }
    public static int subtractTwoNumbers(int y, int z){
        return y-z;
    }
    public static int multiplyTwoNumbers(int y, int z){
        return y*z;
    }
    public static float divideTwoNumbers(float y, float z){
        return y/z;
    }
}
