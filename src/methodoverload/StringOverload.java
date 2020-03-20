package methodoverload;

public class StringOverload {
    public static void main(String[] args) {
        printString();
        printString("Java");
        printString("World", 20);
    }
    public static void printString(){
        for (int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
    public static void printString(String a){
        for (int i=0;i<100;i++){
            System.out.println(a);
        }
    }
    public static void printString(String a, int b){
        for (int i=0;i<b;i++){
            System.out.println(a);
        }
    }
}
