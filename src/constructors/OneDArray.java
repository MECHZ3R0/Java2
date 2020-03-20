package constructors;

import java.util.Arrays;

public class OneDArray {
    int size;
    OneDArray(int size){
        this.size=size;
    }
    void printOddIndexes(){
        int[] arr=new int[size];
        int n=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=2*n+1;
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }
    void printEvenIndexes(){
        int[] arr=new int[size];
        int n=1;
        for (int i=0;i<arr.length;i++){
            arr[i]=2*n;
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }
    void printLargestNumber(){
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10+1);
        }
        int x=arr[0];
        for (int n:arr){
            if (x<n){
                x=n;
            }
        }
        System.out.println(x);
    }
    void printSmallestNumber(){
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10+1);
        }
        int x=arr[0];
        for (int n:arr){
            if (x>n){
                x=n;
            }
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        OneDArray x=new OneDArray(20);
        x.printEvenIndexes();
        x.printOddIndexes();
        x.printLargestNumber();
        x.printSmallestNumber();
    }
}
