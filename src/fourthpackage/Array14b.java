package fourthpackage;

public class Array14b {
    public static void main(String[] args) {
        String[][] a=new String[(int)(Math.random()*10)][(int)(Math.random()*10)];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=genword();
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print("\t"+a[i][j]);
            }
            System.out.println();
        }
    }
    public static String genword(){
        String x = "";
        int wl=(int)(Math.random()*5+1);
        for (int i=0;i<wl;i++){
            x+=(char)((int)(Math.random()*26+97));
        }
        return x;
    }
}
