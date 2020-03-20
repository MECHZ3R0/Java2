package fourthpackage;

public class Array1 {
    public static void main(String[] args) {
        String[] cities = {"New York","Los Angeles", "AnnArbor", "Chicago", "Minneapolis", "Albuquerque"};
        for (int j=0;j<cities.length;j++){
            System.out.println(cities[j]);
        }
        System.out.println();
        for (int i=cities.length-1; i>=0; i--){
            System.out.println(cities[i]);
        }
    }
}
