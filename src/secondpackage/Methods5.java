package secondpackage;

public class Methods5 {
    public static void main(String[] args) {
        ascii();
        multitable();
        multitable2();
        oddnumber(2,100);
    }

    public static void ascii(){
        for (int i=0;i<256;i++){
            System.out.println((char)i);
        }
    }
    public static void multitable(){
        for (int i=1;i<=10;i++){
            for (int j=1; j<=10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println("-----------");
        }
    }
    public static void multitable2(){
        for (int i=1;i<=10;i++){
            for (int j=1; j<=10;j++){
                System.out.print("\t"+i*j);
            }
            System.out.println();
        }
    }
    public static void oddnumber(int x, int y){
        for (int i=x;i<=y;i++) {
            if (i%2 !=0){
                System.out.println(i);
            }
        }
    }
}
