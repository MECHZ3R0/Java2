package constructors;

import java.util.Scanner;

public class Bicycle2 {
    String color;
    int size;
    Bicycle2(String newcolor, int newsize){
        color=newcolor;
        size=newsize;
    }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Color of the bike: ");
        String ncolor=x.nextLine();
        System.out.print("Size of the bike: ");
        int nsize=x.nextInt();
        Bicycle2 bcycle = new Bicycle2(ncolor, nsize);
        System.out.println("Bicycle: "+bcycle.color+ " "+ bcycle.size);
        bcycle.gofast();
    }
    public void gofast(){
        System.out.println("Go Fast");
    }
    public void gofaster(){
        System.out.println("Go Faster");
    }
    public void goslowly(){
        System.out.println("Go Slowly");
    }
    public void slowdown(){
        System.out.println("Slow Down");
    }
}
