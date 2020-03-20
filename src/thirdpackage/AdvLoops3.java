package thirdpackage;

public class AdvLoops3 {
    public static void main(String[] args) {
        for (int k = 0; k < 7; k++) {
            int x = 1;
            x += k;
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (7 - k); i++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
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
