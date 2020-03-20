package constructors;

public class CarConstr {
    int modelYear;
    String modelMake;
    String modelName;
    int carMileage;
    public CarConstr(int year, String make, String name, int mileage){
        modelYear=year;
        modelMake=make;
        modelMake=name;
        carMileage=mileage;
    }
    public static void main (String[] args){
        CarConstr car1=new CarConstr(2019, "BMW", "i9", 10000);
        CarConstr car2=new CarConstr(2020, "Honda","Civic", 5000);
        System.out.println(car1.modelMake +" vs. " +car2.modelMake);
    }
}
