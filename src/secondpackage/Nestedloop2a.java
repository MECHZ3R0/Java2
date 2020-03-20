package secondpackage;

public class Nestedloop2a {
    public static void main(String[] args) {
        int k, j, i=1;
        while(i<10){
            j=0;
            while(j<10){
                k=0;
                while(k<10){
                    System.out.println(i+""+j+""+k);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}
