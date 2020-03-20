package fourthpackage;

public class CityNames2DArray {
    public static void main(String[] args) {
        String[][] cityArr = {{"Albuquerque", "Atlanta", "Boston", "Centralia", "Denver","Edinburg"},{"Frankfurt", "Grant City", "Hogwarts", "Louisiana", "Seatle", "New York"}};
        cityArrayPrint(cityArray(cityArr));
        cityArrayPrintA(cityArray(cityArr));
        reverse(cityArray(cityArr));
        cityArrayPrintA_H(cityArray(cityArr));
    }
    public static String[][] cityArray(String[][] cityArr){
        String[][] randcityArr = new String[2][6];
        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++){
                randcityArr[i][j]=cityArr[(int)(Math.random()*2)][(int)(Math.random()*6)];
            }
        }
        return randcityArr;
    }
    public static void cityArrayPrint(String[][] randcityArr){
        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++){
                System.out.print("\t\t\t"+randcityArr[i][j]);
            }
            System.out.println();
        }
    }
    public static void cityArrayPrintA(String[][] randcityArr){
        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++){
                if(randcityArr[i][j].charAt(j)=='A') {
                    System.out.print("\t\t\t" + randcityArr[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void reverse(String[][] randcityArr){
        String revcity;
        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++){
                revcity="";
                for (int a=randcityArr[i][j].length()-1;a>=0;a--) {
                    revcity+=randcityArr[i][j].charAt(a);
                }
                System.out.print("\t\t\t"+revcity);;
            }
            System.out.println();
        }
    }
    public static void cityArrayPrintA_H(String[][] randcityArr){
        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++){
                if(randcityArr[i][j].charAt(j)>='A'&&randcityArr[i][j].charAt(j)<='H') {
                    System.out.print("\t\t\t" + randcityArr[i][j]);
                }
            }
            System.out.println();
        }
    }

}
