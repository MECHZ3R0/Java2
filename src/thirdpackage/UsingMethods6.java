package thirdpackage;

public class UsingMethods6 {
    public static void main(String[] args) {
        for (int j=1;j<=12;j++){
            System.out.println("Month: "+j);
            month(j);
        }
    }
    public static void month(int x){
        for (int i=0;i<31;i++){
            System.out.println(x+" / "+i+" / "+2020);
        }
    }
}
