package secondpackage;

public class Dowhileloops6 {
    public static void main(String[] args) {
        int x=2;
        for (int i = 0; i < 6; i++) {
            for (int j=1; j < 6; j++) {
                if (x>17&&x<23){
                    System.out.print("\t  ");
                    x++;
                }
                else{
                System.out.print("\t" + x);
                x++;}
            }
            System.out.println();
        }
    }
}
