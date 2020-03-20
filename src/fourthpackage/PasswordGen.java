package fourthpackage;

public class PasswordGen {
    public static void main(String[] args) {
        char [][] arr=new char[4][27];
        passwordgen(randomarray(arr));
    }
    public static char[][] randomarray(char[][] arr){
        int a=0,b=0,c=0,d=0;
        for (int j=33;j<128;j++) {
            if(j>='A'&&j<='Z') {
                if(a<27) {
                    arr[0][a] = (char) j;
                }
                a++;
            }
            else if (j>='a'&&j<='z') {
                if(b<27) {
                    arr[1][b] = (char) j;
                }
                b++;
            }
            else if (j>='0'&&j<='9') {
                if(d<27) {
                    arr[3][d] = (char) j;
                }
                d++;
            }
            else {
                if(c<27) {
                    arr[2][c] = (char) j;
                }
                c++;
            }
        }
        return arr;
    }
    public static void passwordgen(char[][] arr){
        for (int i=0;i<3;i++){
            System.out.print(arr[0][(int)(Math.random()*26)]);
        }
        for (int j=0;j<3;j++){
            System.out.print(arr[1][(int)(Math.random()*26)]);
        }
        System.out.print(arr[2][(int)(Math.random()*26)]);
        for (int k=0;k<4;k++){
            System.out.print(arr[3][(int)(Math.random()*10)]);
        }
    }
}
