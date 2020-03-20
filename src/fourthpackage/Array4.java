package fourthpackage;

public class Array4 {
    public static void main(String[] args) {
        String[] x={"abc","defgh","qwerty","asd"};
        int a=0;
        for (int i=0;i<x.length;i++){
            if(x[i].length()<5){
                a+=1;
            }
        }
        System.out.format("There are %d elements its length is less than 4",a);
    }
}
