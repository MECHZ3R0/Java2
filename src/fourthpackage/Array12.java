package fourthpackage;

public class Array12 {
    public static void main(String[] args) {
        int[] x={1,2,3,4,3,2,1};
        sym(x);
    }
    public static void sym(int[] x){
        boolean q=true;
        for (int i=1;i<x.length;i++){
            if(x[i]!=x[x.length-1-i]){
                q=false;
            }
        }
        if (q){
            System.out.println("Symmetric Array");
        }
        else {
            System.out.println("Asymmetric Array");
        }
    }
}
