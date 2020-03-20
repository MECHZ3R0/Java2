package constructors;

public class Employee {
    int id;
    String name;
    String department;
    double salary;
    char type;
    Employee(){
        this.id=123;
        this.name="Sample";
        this.department="Tech";
        this.salary=4000;
        this.type='K';
    }
    Employee(int id,String name,String department,double salary,char type){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.type=type;
    }
    void weeklyPayment(){
        System.out.println("Your payment is "+(salary/4));
    }
    void biweeklyPayment(){
        System.out.println("Your payment is "+(salary/2));
    }
    void employeeInfo(){
        System.out.println("Your ID is "+id);
        System.out.println("Your name is "+name);
        System.out.println("Your Department is "+department);
        System.out.println("Your salary is "+salary);
        System.out.println("Your contract type is "+type);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) {
        Employee newEmployee = new Employee();
        newEmployee.employeeInfo();
        System.out.println(newEmployee.toString());;
    }
}
