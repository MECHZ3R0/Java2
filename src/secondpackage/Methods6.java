package secondpackage;

public class Methods6 {
    public static void main(String[] args) {
        p1();
        p2();
    }
    public static void p1(){
        for (int k=0;k<10;k++) {
            for (int i = 10; i > k; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*k-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p2(){
        for (int k=0;k<10;k++) {
            for (int i = 0; i < k; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*(10-k)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
