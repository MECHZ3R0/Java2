package firstpackage;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float x=0;
        float y=0;
        float z=0;
        System.out.print("Enter 1st Product Id:");
        int id1 = obj.nextInt();
        System.out.print("Enter 1st Product Quantity:");
        int q1 = obj.nextInt();
        System.out.print("Enter 2nd Product Id:");
        int id2 = obj.nextInt();
        System.out.print("Enter 2nd Product Quantity:");
        int q2 = obj.nextInt();
        System.out.print("Enter 3rd Product Id:");
        int id3 = obj.nextInt();
        System.out.print("Enter 3rd Product Quantity:");
        int q3 = obj.nextInt();
        System.out.println("ID\t\tQuantity\tPrice");
        System.out.println("-------------------------------------");
//id1
        if (id1==123) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id1,q1,(float)(q1*2.49));
            x = (float)(q1*2.49);
        }
        if (id1==124) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id1,q1,(float)(q1*4.79));
            x = (float)(q1*4.79);
        }
        if (id1==125) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id1,q1,(float)(q1*1.65));
            x = (float)(q1*1.65);
        }
        if (id1==126) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id1,q1,(float)(q1*7.88));
             x = (float)(q1*7.88);
        }
        if (id1==127) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id1,q1,(float)(q1*0.99));
             x = (float)(q1*0.99);
        }
//id2
        if (id2==123) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id2,q2,(float)(q2*2.49));
             y = (float)(q2*2.49);
        }
        if (id2==124) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id2,q2,(float)(q2*4.79));
             y = (float)(q2*4.79);
        }
        if (id2==125) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id2,q2,(float)(q2*1.65));
             y = (float)(q2*1.65);
        }
        if (id2==126) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id2,q2,(float)(q2*7.88));
             y = (float)(q2*7.88);
        }
        if (id2==127) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id2,q2,(float)(q2*0.99));
             y = (float)(q2*0.99);
        }
//id3
        if (id3==123) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id3,q3,(float)(q3*2.49));
             z = (float)(q3*2.49);
        }
        if (id3==124) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id3,q3,(float)(q3*4.79));
             z = (float)(q3*4.79);
        }
        if (id3==125) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id3,q3,(float)(q3*1.65));
             z = (float)(q3*1.65);
        }
        if (id3==126) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id3,q3,(float)(q3*7.88));
             z = (float)(q3*7.88);
        }
        if (id3==127) {
            System.out.format("%d\t\t\t%d\t\t$%.2f\n",id3,q3,(float)(q3*0.99));
             z = (float)(q3*0.99);
        }
        System.out.println("");
        System.out.format("TOTAL\t\t%d\t\t$%.2f\n",(q1+q2+q3),(x+y+z));
    }
}
