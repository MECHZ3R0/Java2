package thirdpackage;

public class UsingMethods21lo {
    public static double mortgageloan(int mp, int pn){
        int tp=15000;
        double restofthepayment = tp-mp*pn;
        return restofthepayment;
    }
    public static double carloan(int tp, int pn){
        double inspayment = (tp/pn)*0.9-pn;
        return inspayment;
    }
}
