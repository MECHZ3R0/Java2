package secondpackage;

public class Advloop1 {
    public static void main(String[] args) {
//with for loop
        for (int k=0;k<7;k++) {
            int x=1;
            x+=k;
            for (int j=0; j<k; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i<(7-k) ; i++) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }

// with while loop
        int k=0;
        while (k<20){
            int i=0;
            while(i<(20-k)){
                System.out.print(" ");
                i++;
            }
            int j=0;
            while(j<k){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            k++;
        }

//with do-while loop
        int c=0;
        do{
            int i=0;
            do{
                System.out.print(" ");
                i++;
            }while(i<(20-c));
            int j=0;
            do{
                System.out.print("* ");
                j++;
            }while(j<c);
            System.out.println();
            c++;
        }while (c<20);
    }
}
