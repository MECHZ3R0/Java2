package thirdpackage;

public class UsingMethods8 {
    public static void main(String[] args) {
        p1(1);
        p2();
    }
    public static void p1(int x){
        for (int k = 0; k < 7; k++) {
            x += k;
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (7 - k); i++) {
                System.out.print(x + " ");
                x++;
            }
            x=1;
            System.out.println();
        }
    }
    public static void p2(){
        for (int k = 6; k > 0; k--) {
            int x=k;
            for (int j = 1; j < k; j++) {
                System.out.print(" ");
            }
            for (int i = 8-k; i > 0; i--) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
