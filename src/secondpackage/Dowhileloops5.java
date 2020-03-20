package secondpackage;

public class Dowhileloops5 {
    public static void main(String[] args) {
        //for loop
        int x=1;
            for (int i = 0; i < 3; i++) {
                for (int j=1; j < 6; j++) {
                    System.out.print("\t" + x);
                    x++;
                }
                System.out.println();
            }
        System.out.print("\n\n");
            //while loop
        x=1;
         do{
             int i=1;
             while(i<=5){
                 System.out.print("\t"+x);
                 x++;
                 i++;
             }
             System.out.println();
         }while(x<=15);
    }
}
