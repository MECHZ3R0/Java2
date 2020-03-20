package accessmodifiers;

public class Exampleofprivateattributes {
    private int a;
    private double b;
    private String c;
    Exampleofprivateattributes(int a, double b, String c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void setA(int a){
        this.a=a;
    }
    int getA(){
        return this.a;
    }
    void setB(double b){
        this.b=b;
    }
    double getB(){
        return this.b;
    }
    void setC(String c){
        this.c=c;
    }
    String getC(){
        return this.c;
    }
}
