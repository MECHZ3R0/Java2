package fourthpackage;

public class SquareArray {
    public static void main(String[] args) {
        int[][] a= {{1,2},{3,4}};
        System.out.println(isSquare(a));
        System.out.println(isSquare2(a));
    }
    public static boolean isSquare(int[][] a){
        int b=0,c=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
               b+=i;
               c+=j;
            }
        }
        return  b==c;
    }
    public static boolean isSquare2(int[][] a) {
        boolean x=true;
        for (int[] rows : a) {
            if (a.length != rows.length) {
                x = false;
                break;
            }
        }
        return x;
    }
}
