package methodsreview;

public class CapitalLetters {
    public static void main(String[] args) {
        String sample="\"This Is Java World!\"";
        System.out.println("Number of Capital Letters in "+sample+" sentence is "+capitalletters(sample)+".");
    }
    public static int capitalletters(String sample){
        int count=0;
        for (int i=0;i<sample.length();i++) {
            if (sample.charAt(i)>=65&&sample.charAt(i)<=90){
                count++;
            }
        }
        return count;
    }
}
