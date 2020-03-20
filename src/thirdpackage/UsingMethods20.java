package thirdpackage;

public class UsingMethods20 {
    public static void main(String[] args) {
        System.out.println(letters(3)+numbers(3));
    }
    public static String letters(int x){
        String a="";
        for (int i=0; i<x;i++){
            a=a+(char)(97+(int)(Math.random()*26));
        }
        return a;
    }
    public static String numbers(int y){
        String b="";
        for (int i=0; i<y;i++){
            b=b+(int)(Math.random()*10);
        }
        return b;
    }
}
