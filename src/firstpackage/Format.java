package firstpackage;

public class Format {
    public static void main (String[] args){
        int number1 = 14;
        float number2 = 14.6f;
        double number3 = 14.7;

        System.out.format("This is String %d %.1f %f", number1, number2, number3);
    }
}
