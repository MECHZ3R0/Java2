package secondpackage;

public class Nestedloop3a {
    public static void main(String[] args) {
        int k, j, i=0;
        while(i<2){
            j=0;
            while(j<2){
                k=0;
                while(k<2){
                    System.out.println(i+""+j+""+k);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}
