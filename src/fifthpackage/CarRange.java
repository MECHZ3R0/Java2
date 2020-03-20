package fifthpackage;

public class CarRange {
    public static void main(String[] args) {
        System.out.println(carRangeCalc(35,12.5));
    }
    public static int carRangeCalc(double mpg, double gallon){
        return (int)(mpg*gallon);
    }
}
