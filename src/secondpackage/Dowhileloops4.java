package secondpackage;

public class Dowhileloops4 {
    public static void main(String[] args) {
        int i=1;
        while(i<13){
            int j=1;
            do{
                System.out.format("%d/%d/2020\n",i,j);
                j++;
            }
            while (j<31);
            i++;
        }
    }
}
