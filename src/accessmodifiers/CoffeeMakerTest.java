package accessmodifiers;

public class CoffeeMakerTest {
    public static void main(String[] args) {
        CoffeeMaker x = new CoffeeMaker(2);
        System.out.println(x.getTimer());
        x.setTimer(40);
        System.out.println(x.getTimer());
        x.resetTimer();
        System.out.println(x.getTimer());
    }
}
