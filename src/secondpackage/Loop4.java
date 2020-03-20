package secondpackage;

public class Loop4 {
    public static void main(String[] args) {
        for (int i=40;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\n\n");
        int a=40;
        while (a>0){
            int b=0;
            while (b<a) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a--;
        }
        System.out.print("\n\n");
        int c=40;
        do {
            int d=0;
            do{
                System.out.print("*");
                d++;
            }
            while(d<c);
            System.out.println();
            c--;
        }
        while(c>0);
    }
}
