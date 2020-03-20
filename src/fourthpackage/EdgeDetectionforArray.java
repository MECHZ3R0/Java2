package fourthpackage;

public class EdgeDetectionforArray {
    public static void main(String[] args) {
        int[][] arr = {{0,18,238,255,248,},{0,87,255,255,255},{0,75,255,255,249},{0,39,255,255,255},{0,67,255,255,239}};
        readArray(arr);
        System.out.println("---------------------------------------");
        readArray(edgedetection(arr));
        System.out.println("---------------------------------------");
        readArray(edgedetection2(arr));
    }
    public static void readArray(int[][] arr){
        for (int row[]:arr){
            for (int numbers:row){
                System.out.print(numbers+"\t");
            }
            System.out.println();
        }
    }
    public static int[][] edgedetection(int[][] arr) {
        int[][] newarr = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if (arr[i][j]>arr[i][j-1]) {
                    newarr[i][j] = arr[i][j] - arr[i][j - 1];
                }
                else {
                    newarr[i][j] = arr[i][j-1] - arr[i][j];
                }
            }
        }
        return newarr;
    }
    public static int[][] edgedetection2(int[][] arr) {
        int[][] newarr = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                newarr[i][j] = Math.abs(arr[i][j] - arr[i][j - 1]);
            }
        }
        return newarr;
    }
}
