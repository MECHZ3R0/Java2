package constructors;

public class Shapes {
    char symbol;
    int width;
    int height;
    Shapes(){
    symbol='*';
    width=10;
    height=10;
    }
    Shapes(char symbol, int width,  int height){
        this.symbol=symbol;
        this.width=width;
        this.height=height;
    }
    void pyramid(){
        for(int i=0;i<height;i++){
            for (int j=i;j<width;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print(symbol+"   ");
            }
            System.out.println();
        }
    }
    void rectangle(){
        for(int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.print("   "+symbol);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Shapes x=new Shapes();
        x.pyramid();
        System.out.println();
        x.rectangle();
    }
}
