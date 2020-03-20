package secondpackage;

public class Nestedforloops5 {
    public static void main(String[] args) {
        System.out.print("\t\t");
        for (int a=1;a<11;a++){
            System.out.print("\t"+a);
        }
        System.out.print("\n");
        for (int b=1;b<55;b++){
            System.out.print("-");
        }
        System.out.println();
        for (int i=1;i<11;i++){
            System.out.print(i+"\t\t");
            for (int j=1;j<11;j++){
                System.out.print(("\t"+i*j));
            }
            System.out.println();
        }
    }
}
