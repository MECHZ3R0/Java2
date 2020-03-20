package fourthpackage;

public class Array14 {
    public static void main(String[] args) {
        int[][] a=new int[(int)(Math.random()*10)][(int)(Math.random()*10)];
        int x=(int)(Math.random()*10);
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=x;
                x=(int)(Math.random()*10);
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
