package thirdpackage;

public class UsingMethods4 {
    public static void main(String[] args) {
    numbers();
    ascii();
    low();
    up();
    }
    public static void numbers(){
        for (int i=100; i<=1000;i++){
            System.out.println(i);
        }
    }
    public static void ascii(){
        for (int i=0; i<256;i++){
            System.out.println((char)i);
        }
    }
    public static void low(){
        for (int i=97; i<=122;i++){
            System.out.println((char)i);
        }
    }
    public static void up(){
        for (int i=65; i<=90;i++){
            System.out.println((char)i);
        }
    }
}
