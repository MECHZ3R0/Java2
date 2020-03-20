package thirdpackage;

public class UsingMethods21 {
    public static void main(String[] args) {
        System.out.print("Electric consumption: ");
        System.out.println(UsingMethods21inv.electric(550));
        System.out.print("Internet Speed: ");
        System.out.println(UsingMethods21inv.internet(310));
        System.out.print("Remaining payment: $");
        System.out.println(UsingMethods21lo.mortgageloan(400,8));
        System.out.print("For Car Insurance: $");
        System.out.println(UsingMethods21lo.carloan(15000,8));
        UsingMethods21sug.food();
        UsingMethods21sug.cloth();
    }
}
