package fourthpackage;

public class ArrayIntersection {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8};
        int [] arr2 = {3,4,9,12,13};
        inter(arr1, arr2);

    }
    public static void inter(int[] arr1, int[] arr2){
        for (int i=0;i<arr1.length; i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+"\t");
                }
            }
        }
    }
}
