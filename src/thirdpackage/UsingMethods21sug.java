package thirdpackage;

public class UsingMethods21sug {
    public static void food(){
        int x= (int)(Math.random()*3+1);
        switch (x){
            case 1:
                System.out.println("Drink Soup");
                break;
            case 2:
                System.out.println("Eat Hamburger");
                break;
            case 3:
                System.out.println("Enjoy Salad");
                break;
        }
    }
    public static void cloth(){
        int x= (int)(Math.random()*3+1);
        switch (x){
            case 1:
                System.out.println("red shirt");
                break;
            case 2:
                System.out.println("blue jeans");
                break;
            case 3:
                System.out.println("white hat");
                break;
        }
    }
}
