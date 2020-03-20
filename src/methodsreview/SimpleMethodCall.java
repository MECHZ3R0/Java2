package methodsreview;

public class SimpleMethodCall {
    public static void main(String[] args) {
        doCalculation(4,2,"multiply");
    }
    public static int doCalculation(int a, int b, String math){
        int c=0;
        if (math.equalsIgnoreCase("add")){
            c= a+b;
        }
        if (math.equalsIgnoreCase("subtract")){
            c= a-b;
        }
        if (math.equalsIgnoreCase("multiply")){
            c= a*b;
        }
        if (math.equalsIgnoreCase("divide")){
            c= a/b;
        }
        return c;
    }
}
