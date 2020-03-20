package fourthpackage;

public class SeparateZero {
    public static void main(String[] args) {
        int[] arr={0,0,5,4,0,2,1,0};
        sep(arr);
    }
    public static void sep(int[] arr){
        int[] arr2=new int[arr.length];
        int k=0,a=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr2[a]=arr[i];
                a++;
            }
            else if (arr[i]==0){
                arr2[arr.length-1-k]=arr[i];
                k++;
            }
        }
        for (int n:arr2){
            System.out.print(n+"\t");
        }
    }
}
