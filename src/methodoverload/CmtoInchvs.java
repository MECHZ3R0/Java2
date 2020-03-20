package methodoverload;

public class CmtoInchvs {
    public static void main(String[] args) {
        System.out.print("1 cm is equal to ");
        convertLength(1.0);
        System.out.print("1 inch is equal to ");
        convertLength(1);

    }
    public static void convertLength(int x){
        System.out.println(x*2.54+" cm");
    }
    public static void convertLength(double x){
        System.out.println(x*0.394+" inches");
    }
}
