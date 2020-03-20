package secondpackage;

public class Advloop2 {
    public static void main(String[] args) {
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
}
