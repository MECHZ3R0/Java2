package firstpackage;

public class FormatQuestion {
    public static void main (String[] args){
        float number2 = 78.98f;
        double number3 = 78.98;
        String people = "Java is fun";
        System.out.format("Do you think %s?\n", people);
        System.out.format("\t Yes %%%f of the people thinks it is fun\n", number3);
        System.out.format("\t Yes %%%.2f of the people thinks it is fun", number2);
    }
}
