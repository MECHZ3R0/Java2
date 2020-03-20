package constructors;

public class Bicycle {
    String color;
    int size;
    Bicycle(String newcolor, int newsize){
        color=newcolor;
        size=newsize;
    }

    public static void main(String[] args) {
        Bicycle bcycle=new Bicycle("Green", 14);
        System.out.println("Bicycle: "+bcycle.color+ " "+ bcycle.size);
        speed(2);
    }
    public static void speed(int speed){
        switch (speed){
            case 1: System.out.println("go fast");
            break;
            case 2: System.out.println("go faster");
            break;
            case 3: System.out.println("go slowly");
            break;
            case 4: System.out.println("go slow down");
            break;
        }
    }
}
