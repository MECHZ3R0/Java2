package fifthpackage;

public class Q1 {
    public static void main(String[] args) {
        boolean id = true;
        control(id);
    }
    public static void control(boolean id){
        if (id){
            System.out.println("You may enter the building :)");
        }
        else {
            System.out.println("No entry. Sorry. :(");
        }

    }
}
