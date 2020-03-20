package fourthpackage;

public class Array15 {
    public static void main(String[] args) {
        printArray(array());
        System.out.println();
        rowsum(array());
        System.out.println();
        collumnsum(array());
        System.out.println();
        printArrayby4(array());
        System.out.println();
        printArrayTriangle(array());
    }
    public static int[][] array() {
        int[][] x = new int[10][10];
        int y = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = y;
                y++;
            }
        }
        return x;
    }
    public static void printArray(int[][] x){
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print("\t"+x[i][j]);
            }
            System.out.println();
        }
    }
    public static void rowsum(int[][] x){
        int z=0;
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                z+=x[i][j];
            }
            System.out.println(z);
        }
    }
    public static void collumnsum(int[][] x){
        int z=0;
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                z+=x[j][i];
            }
            System.out.println(z);
        }
    }
    public static void printArrayby4(int[][] x){
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(x[i][j]%4==0) {
                    System.out.print("\t" + x[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void printArrayTriangle(int[][] x){
        int k=1;
        for (int i=0;i<x.length;i++){
            for(int j=0;j<k;j++){
                System.out.print("\t"+x[i][j]);
            }
            k++;
            System.out.println();
        }
    }
}
