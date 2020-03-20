package fourthpackage;

public class Array5 {
    public static void main(String[] args) {
        int[] x={1,2,3,3,4,4,5,5};
        for (int i=0;i<x.length-1;i++){
            if (x[i]==x[i+1]){
                System.out.println(x[i]);
            }
        }
    }
}
