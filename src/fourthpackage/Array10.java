package fourthpackage;

public class Array10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        mvalue(arr);
    }
    public static int mvalue(int[] arr){
        int x=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    if (x<arr[i]) {
                        x = arr[i];
                    }
                }
            }
        }
        System.out.println("The biggest number in this array is "+x+".");
        return x;
    }
}
