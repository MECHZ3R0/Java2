package methodoverload;

public class CostofProduct {
    public static void main(String[] args) {
        System.out.println(cost(35,3.3));
        System.out.println(cost(35,3.3,5));
    }

    public static double cost(int basePrice, double tax) {
        return (basePrice+tax)*1.1;
    }
    public static double cost(int basePrice, double tax, int shipping) {
        return (basePrice+tax)*1.1 + shipping;
    }
}
