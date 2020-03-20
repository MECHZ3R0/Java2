package secondpackage;

public class Forloops2 {
    public static void main(String[] args) {
        long y = 65;
        for (int i=0; i<26; i++){
            char x = (char) y;
            System.out.println(x);
            y=y+1;
        }
        long z = 97;
        for (int i=0; i<26; i++){
            char w = (char) z;
            System.out.println(w);
            z=z+1;
        }
    }
}
