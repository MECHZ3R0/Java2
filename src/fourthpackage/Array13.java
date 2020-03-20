package fourthpackage;

public class Array13 {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int x=1;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=x;
                x++;
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print("\t"+a[i][j]);
            }
            System.out.println();
        }
    }
}
