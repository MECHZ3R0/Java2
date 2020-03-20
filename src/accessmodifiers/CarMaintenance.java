package accessmodifiers;

public class CarMaintenance {
    private String carName;
    private int odometer;
    private int nextOilChange;
    private String airFilter;
    private String cabinFilter;
    private String oilFilter;

    public CarMaintenance(String carName, int odometer, int nextOilChange, String airFilter, String cabinFilter, String oilFilter) {
        this.carName=carName;
        this.odometer=odometer;
        this.nextOilChange=nextOilChange;
        this.airFilter=airFilter;
        this.cabinFilter=cabinFilter;
        this.oilFilter=oilFilter;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getNextOilChange() {
        return nextOilChange;
    }

    public void setNextOilChange(int nextOilChange) {
        this.nextOilChange = nextOilChange;
    }

    public String getAirFilter() {
        return airFilter;
    }

    public void setAirFilter(String airFilter) {
        this.airFilter = airFilter;
    }

    public String getCabinFilter() {
        return cabinFilter;
    }

    public void setCabinFilter(String cabinFilter) {
        this.cabinFilter = cabinFilter;
    }

    public String getOilFilter() {
        return oilFilter;
    }

    public void setOilFilter(String oilFilter) {
        this.oilFilter = oilFilter;
    }

    void doOilChange(int addNextOilChange){
        if (airFilter.equalsIgnoreCase("old")&&(odometer-this.nextOilChange)>=0){
            airFilter="new";
        }
        else{
            System.out.println("No need to change air filter.");
        }
        if (cabinFilter.equalsIgnoreCase("old")&&(odometer-this.nextOilChange)>=0){
            cabinFilter="new";
        }
        else{
            System.out.println("No need to change cabin filter.");
        }
        if (oilFilter.equalsIgnoreCase("old")&&(odometer-this.nextOilChange)>=0){
            oilFilter="new";
        }
        else{
            System.out.println("No need to change oil filter.");
        }
        this.nextOilChange=odometer+addNextOilChange;
    }
    public String displayFilterStatuses() {
        return "All Filter Statuses {airFilter=" + airFilter +", cabinFilter=" + cabinFilter + ", oilFilter=" + oilFilter + '}';
    }
}
