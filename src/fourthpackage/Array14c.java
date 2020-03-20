package fourthpackage;

public class Array14c {
    public static void main(String[] args) {
        char[][] a=new char[(int)(Math.random()*10)][(int)(Math.random()*10)];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=(char)((int)(Math.random()*26+97));
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
