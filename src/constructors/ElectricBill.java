package constructors;

public class ElectricBill {
    int memberId;
    int counter;
    String name;
    Double billAmount;
    ElectricBill(int id, int counter, String name, double bill){
        this.memberId=id;
        this.counter=counter;
        this.name=name;
        this.billAmount=bill;
    }
    void DisplayMemberInformation(){
        System.out.println("Member ID: "+memberId);
        System.out.println("Name: "+name);
    }
    void DisplayBill(){
        System.out.println("Your Current Bill: $"+(billAmount+=1.9*counter));
    }
    void ReadTheCounter(){
        System.out.println("The Counter Amount: "+counter);
    }
    void addConsumption(int counter){
        this.counter=counter;
    }

    public static void main(String[] args) {
        ElectricBill newBill=new ElectricBill(123,0,"Sample",0.0);
        newBill.DisplayMemberInformation();
        newBill.DisplayBill();
        newBill.ReadTheCounter();
        newBill.addConsumption(100);
        newBill.ReadTheCounter();
        newBill.DisplayBill();
    }
}
