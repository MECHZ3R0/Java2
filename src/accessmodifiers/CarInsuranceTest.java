package accessmodifiers;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance myIns = new CarInsurance(2010,0,0);
        double myOffer = myIns.makeOffer(2020);
        System.out.println(myOffer);
    }
}
