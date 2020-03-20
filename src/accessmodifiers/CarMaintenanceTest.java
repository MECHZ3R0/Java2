package accessmodifiers;

public class CarMaintenanceTest {
    public static void main(String[] args) {
        CarMaintenance x=new CarMaintenance("Ford", 50000,49995, "new","new","old");
        System.out.println(x.displayFilterStatuses());
        x.doOilChange(500);
        System.out.println(x.displayFilterStatuses());
        System.out.println(x.getNextOilChange());
    }
}
