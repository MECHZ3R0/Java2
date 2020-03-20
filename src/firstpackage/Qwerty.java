package firstpackage;
import java.util.Scanner;
public class Qwerty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //constant data
        float itemcost1 = 2.49f;
        float price1 = 0.0f;
        float itemcost2 = 4.79f;
        float price2 = 0.0f;
        float itemcost3 = 1.65f;
        float price3 = 0.0f;
        float itemcost4 = 7.88f;
        float itemcost5 = 0.99f;
        //variables
        int id1;
        float QTY1;
        int id2;
        float QTY2;
        int id3;
        float QTY3;
        System.out.print("Enter product-1 ID of your items:");
        int id;
        id = scanner.nextInt();
        id1 = id;
        System.out.print("Enter product-1 quantity of your items:");
        float QTY;
        QTY = scanner.nextFloat();
        QTY1 = QTY;
        if (id == 123)
            price1 = QTY1 * itemcost1;
        if (id == 124)
            price1 = QTY1 * itemcost2;
        if (id == 125)
            price1 = QTY1 * itemcost3;
        if (id == 126)
            price1 = QTY1 * itemcost4;
        if (id == 127)
            price1 = QTY1 * itemcost5;
        System.out.print("Enter product-2 ID of your items:");
        id = scanner.nextInt();
        id2 = id;
        System.out.print("Enter product-2 quantity of your items:");
        QTY = scanner.nextFloat();
        QTY2 = QTY;
        if (id == 123)
            price2 = QTY2 * itemcost1;
        if (id == 124)
            price2 = QTY2 * itemcost2;
        if (id == 125)
            price2 = QTY2 * itemcost3;
        if (id == 126)
            price2 = QTY2 * itemcost4;
        if (id == 127)
            price2 = QTY2 * itemcost5;
        System.out.print("Enter product-3 ID of your items:");
        id = scanner.nextInt();
        id3 = id;
        System.out.print("Enter product-3 quantity of your items:");
        QTY = scanner.nextFloat();
        QTY3 = QTY;
        if (id == 123)
            price3 = QTY3 * itemcost1;
        if (id == 124)
            price3 = QTY3 * itemcost2;
        if (id == 125)
            price3 = QTY3 * itemcost3;
        if (id == 126)
            price3 = QTY3 * itemcost4;
        if (id == 127)
            price3 = QTY3 * itemcost5;
        System.out.println("\t\t\tThe Receipt");
        System.out.println("\tID \t\t quantity \t\tPrice");
        System.out.println("------------------------------------");
        System.out.format("\t" + id1 + "\t\t\t" + "%.2fQTY1" + "\t\t\t" + "$%.2f\n", QTY1, price1);
        System.out.format("\t" + id2 + "\t\t\t" + "%.2fQTY1" + "\t\t\t" + "$%.2f\n", QTY1, price2);
        System.out.format("\t" + id3 + "\t\t\t" + "%.2fQTY1" + "\t\t\t" + "$%.2f\n", QTY1, price3);
        System.out.println("---------\t---------\t------------");
        System.out.format("  Total" + "\t\t\t" + (QTY1 + QTY2 + QTY3) + "\t\t\t" + "$%.2f\n", (price1 + price2 + price3));
        System.out.println("");

        System.out.println("---------Thank you. Come Again!------------");
    }
}
