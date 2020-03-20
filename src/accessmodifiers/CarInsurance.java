package accessmodifiers;

public class CarInsurance {
    private int modelYear;
    private int numberOfTickets;
    private int numberOfAccidents;
    double priceOffer;
    final double basePrice=99.9;

    public CarInsurance(int modelYear, int numberOfTickets, int numberOfAccidents) {
        this.modelYear=modelYear;
        this.numberOfTickets=numberOfTickets;
        this.numberOfAccidents=numberOfAccidents;
        this.priceOffer=0;
    }

    public int getModelYear(){
        return modelYear;
    }

    public void setModelYear(int modelYear){
        this.modelYear=modelYear;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }

    public void setNumberOfAccidents(int numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }

    public double getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(double priceOffer) {
        this.priceOffer = priceOffer;
    }

    public double makeOffer(int currentYear){
        this.priceOffer=basePrice+(currentYear-modelYear)*50+(30*numberOfTickets)+(100*numberOfAccidents);
        return this.priceOffer;
     }

}
