package constructors;

public class BankAccount {
    String name;
    double balance;
    int account;
    BankAccount(String nname,double nbalance,int naccount){
        name=nname;
        balance=nbalance;
        account=naccount;
    }
    void checkbalance(){
        System.out.println("Your balance is "+ balance);
    }
    void addmoney(){
        System.out.println("Your balance is "+ (balance+=10));
    }
    void addmoney(int money){

        System.out.println("Your balance is "+ (balance+=money));
    }
    void drawmoney(){
        System.out.println("Your balance is "+ (balance-=10));
    }
    void drawmoney(int money){
        System.out.println("Your balance is "+ (balance-=money));
    }

    public static void main(String[] args) {
        BankAccount x = new BankAccount("Bank",2001.50,12345);
        x.checkbalance();
        x.addmoney();
        x.addmoney(6);
        x.drawmoney();
        x.drawmoney(1);
    }
}
