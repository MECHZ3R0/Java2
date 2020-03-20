package secondpackage;

public class Dowhileloops2 {
    public static void main(String[] args) {
        double c = 100;
        do{
            System.out.println((int)c);
            c=c-0.5;
            System.out.println(c);
            c=c-0.5;
        }
        while (c>0);
        System.out.println((int)c);
    }
}
