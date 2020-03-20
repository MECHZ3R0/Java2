package fourthpackage;

public class Array9 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        merge(a,b);
    }
    public static void merge(int[]a,int[]b){
        int[]c=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            c[k]=a[i];
            k++;
        }
        for(int j=0;j<b.length;j++){
            c[k]=b[j];
            k++;
        }
        for (k=0;k<c.length;k++){
            System.out.print(c[k]);
            if(k!=c.length-1){
                System.out.print(", ");
            }
        }
    }
}
