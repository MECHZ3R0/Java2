package fourthpackage;

public class Value2Dimension {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6,},{7,8,9}};
        System.out.print("Big value on each row: ");
        printArrValue(bvalue(arr));
        System.out.print("Small value on each row: ");
        printArrValue(svalue(arr));
        System.out.print("Difference of values on each row: ");
        printArrValue(dvalue(bvalue(arr),svalue(arr)));
    }
    //Build new return outputArray to store BIG values on each row:
    public static int[] bvalue(int[][] arr){
        int x;
        int[] outputArray=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            x=0;
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]>x){
                    x=arr[i][j];
                }
            }
            outputArray[i]=x;
        }
        return outputArray;
    }
    //Build new return outputArray to store SMALL values on each row:
    public static int[] svalue(int[][] arr){
        int x=0,y=0;
        int[] outputArray=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]>x){
                    x=arr[i][j];
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            y=x;
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]<y){
                    y=arr[i][j];
                }
            }
            outputArray[i]=y;
        }
        return outputArray;
    }
    //Build new return outputArray to store DIFFERENCE values on each row:
    public static int[] dvalue(int[] arr1,int[] arr2){
        int x=0,y=0;
        int[] outputArray=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            outputArray[i]=arr1[i]-arr2[i];
        }
        return outputArray;
    }
    //Print values on return outputArrays:
    public static void printArrValue(int[] outputArray){
        for (int i=0;i<outputArray.length;i++){
            System.out.print("\t"+outputArray[i]);
        }
        System.out.println();
    }
}
