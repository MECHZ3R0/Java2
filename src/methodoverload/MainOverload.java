package methodoverload;

public class MainOverload {
    public static void main(String[] args) {
        System.out.println("test1");
        MainOverload.main("test4");
    }

    public static void main(String args) {
        System.out.println("test2"+args);
        MainOverload.main("test5","test6");
    }

    public static void main(String args1, String args2) {
        System.out.println("test3"+args1+args2);
    }
}
