package accessmodifiers;

public class ExampleofprivateattributesTest {
    public static void main(String[] args) {
        Exampleofprivateattributes x=new Exampleofprivateattributes(0,0.0,"");
        x.setA(5);
        x.setB(10.5);
        x.setC("Sample");
        System.out.println(x.getA());
        System.out.println(x.getB());
        System.out.println(x.getC());

    }
}
