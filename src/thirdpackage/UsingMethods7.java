package thirdpackage;

public class UsingMethods7 {
    public static void main(String[] args) {
        forloop(1);
        System.out.println("\n\n");
        whileloop(1);
    }
    public static void forloop(int x){
        for (int i=0; i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print(x+"\t");
                x++;
            }
            System.out.println();
        }
    }
    public static void whileloop(int x){
        int i=0;
        while (i<3){
            int j=0;
            while (j<5){
                System.out.print(x+"\t");
                x++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
