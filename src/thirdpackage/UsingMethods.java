package thirdpackage;

public class UsingMethods {
    public static void main(String[] args) {
        System.out.println("Name");
        namewop();
        namewp("Name");
        System.out.println(namewop2());
        System.out.println(namewp2("Name"));
    }
    public static void namewop(){
        System.out.println("Name");
    }
    public static void namewp(String x){
        System.out.println(x);
    }
    public static String namewop2(){
        return "Name";
    }
    public static String namewp2(String x){
        return x;
    }
}
