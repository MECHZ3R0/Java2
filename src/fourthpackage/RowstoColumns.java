package fourthpackage;

public class RowstoColumns {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        printarray(arr);
        System.out.println("-----");
        printarray(rowtocolumn(arr));
    }
    public static int[][] rowtocolumn(int[][] arr){
        int[][] newarr =new int[arr.length][arr[0].length];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                newarr[i][j]=arr[j][i];
            }
        }
        return newarr;
    }
    public static void printarray(int[][] arr){
        for (int row[]:arr){
            for(int column:row){
                System.out.print(column+"\t");
            }
            System.out.println();
        }
    }
}
