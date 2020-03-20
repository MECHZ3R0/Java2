package secondpackage;

public class Loop6 {
    public static void main(String[] args) {

//with for loop
        for (int k=20;k>0;k--) {
            for (int i = 0; i < (20-k); i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

// with while loop
        int k=20;
        while (k>0){
            int i=0;
            while(i<(20-k)){
                System.out.print(" ");
                i++;
            }
            int j=0;
            while(j<k){
                System.out.print("*");
                j++;
            }
            System.out.println();
            k--;
        }

//with do-while loop
        int c=20;
        do{
            int i=0;
            do{
                System.out.print(" ");
                i++;
            }while(i<(20-c));
            int j=0;
            do{
                System.out.print("*");
                j++;
            }while(j<c);
            System.out.println();
            c--;
        }while (c>0);
    }
}
