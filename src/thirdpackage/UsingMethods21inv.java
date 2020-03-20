package thirdpackage;

public class UsingMethods21inv {
    public static String electric(int a) {
        String x = "";
        if (a >= 500 && a <= 1000) {
            x = "Good Job!";
        } else if (a > 1000 && a <= 1500) {
            x = "Not Bad!";
        } else if (a > 1500) {
            x = "Start saving energy!";
        }
        return x;
    }
    public static String internet(int b){
        String y = "";
        if (b>300){
            y="Super Speed";
        }
        else if (b>100){
            y="Good Speed";
        }
        return y;
    }
}
