package thirdpackage;

public class Menureceive {
    public static double receipt(String a, String b, String c){
        double total = 0;
        switch (a){
            case "Lentil":
                total+=3.99;
                break;
            case "Tomato":
                total+=4.99;
                break;
            case "Fish":
                total+=8.99;
                break;
        }
        switch (b){
            case "Rice":
                total+=3.99;
                break;
            case "Chicken":
                total+=5.99;
                break;
            case "Beef":
                total+=7.99;
                break;
        }
        switch (c){
            case "Ceaser":
                total+=3.99;
                break;
            case "Waldorf":
                total+=4.99;
                break;
        }
        return total;
    }
}
