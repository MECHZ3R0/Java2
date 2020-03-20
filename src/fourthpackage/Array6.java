package fourthpackage;

public class Array6 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b=new int[a.length/2+1];
        int[] c=new int[a.length/2];
        for (int i=0;i<=a.length/2;i++){
            b[i]+=a[i];
            System.out.print(b[i]+", ");
        }
        System.out.println();
        for (int j=0, k=a.length/2+1;k<a.length; j++, k++) {
                c[j] = a[k];
            System.out.print(c[j]+", ");
        }
    }
}
