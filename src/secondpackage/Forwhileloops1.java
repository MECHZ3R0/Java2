package secondpackage;

public class Forwhileloops1 {
    public static void main(String[] args) {
        int j=97;
        for (int i=1;i<6;i++){
            int k=1;
            System.out.print(i+" ");
            while(k<5){
                if (j!=113){
                System.out.format("%c ",j);}
                else{System.out.print("  ");}
                k++;
                j++;
            }
            System.out.println();
        }
    }
}

