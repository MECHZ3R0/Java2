package thirdpackage;

public class UsingMethods16 {
    public static void main(String[] args) {
        remcon("helooor");
    }
    public static void remcon(String a){
        String d="";
        for (int i=0;i<a.length();i++){
            if (i<a.length()-1){
                if (a.charAt(i)==a.charAt(i+1)){
                    d=d+"";
                }
                else {
                    d=d+a.charAt(i);
                }
            }
            else d=d+a.charAt(i);
        }
        System.out.println(d);
    }
}