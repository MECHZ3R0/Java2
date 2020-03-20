package accessmodifiers;

public class Cipher {
    private String input;
    private int shift;
    private Cipher(){
        this.input="Sample";
        this.shift=3;
    }
    Cipher(String input,int shift){
        this.input=input;
        this.shift=shift;
    }
    String cipher(){
        String newinput="";
        for (int i=0;i<input.length();i++){
            newinput+=(char)(input.charAt(i)+shift);
        }
        input=newinput;
        return input;
    }
    String decipher(){
        String newinput="";
        for (int i=0;i<input.length();i++){
            newinput+=(char)(input.charAt(i)-shift);
        }
        input=newinput;
        return input;
    }
    void setInput(String input){
        this.input=input;
    }
    String getInput(){
        return input;
    }
    private void setShift(int shift){
        this.shift=shift;
    }
    int getShift(){
        return shift;
    }
}
