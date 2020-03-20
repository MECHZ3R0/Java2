package fourthpackage;

public class Array3 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9,10,11};
        int a=0;
        for (int i=0;i<x.length;i++){
            if (x[i]%2!=0){
                a+=1;
            }
        }
        System.out.format("There are %d odd numbers",a);
    }
}
