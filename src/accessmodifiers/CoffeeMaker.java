package accessmodifiers;

public class CoffeeMaker {
    private int cups;
    private int timer;
    private boolean brew;
    public CoffeeMaker(int cups) {
        this.cups=cups;
        this.timer=0;
        this.brew=false;
    }
    public void setTimer(int timer) {
        this.timer = timer;
    }
    public int getTimer() {
        return timer;
    }
    public void resetTimer(){
        this.timer=0;
        System.out.println("Timer is reset!");
    }
    public boolean isBrew(){
        return brew;
    }
    public void setBrew(boolean brew){
        this.brew=brew;
    }
    public void brewCoffee(){
        if(timer==0&&brew){
            System.out.println("Brewing now...");
        }
        else if (timer!=0&&brew) {
            System.out.println("Brewing will start in "+timer+" minutes!");
        }
        else {
            System.out.println("Brewing error!!!");
        }
    }
}
