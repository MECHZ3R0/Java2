package fourthpackage;

import java.util.Scanner;

//in this code you need to write your own 4 survey questions after you run the code, and then receive reply for those written questions:

public class SurveyArray {
    public static void main(String[] args) {
        String[] questionarr = new String[4];
        int[] answerarr = new int[4];
        buildanswer(answerarr, buildq(questionarr));

    }
    public static String[] buildq(String[] questionarr){
        Scanner x=new Scanner(System.in);
        for (int i=0;i<4;i++){
            System.out.print("Write your survey question "+(i+1)+": ");
            questionarr[i] = x.nextLine();
        }
        return questionarr;
    }
    public static void buildanswer(int[] answerarr, String[] questionarr){
        Scanner x=new Scanner(System.in);

        for (int i=0;i<4;i++){
            System.out.println(questionarr[i]);
            System.out.println("What is your answer from 1-10?: ");
            answerarr[i] = x.nextInt();
        }
        int sum=0;
        for (int j=0;j<4;j++){
            sum+=answerarr[j];
        }
        System.out.print("According to survey, you are ");
        if (sum>=0&&sum<=10){
            System.out.println("not selfish!");
        }
        else if (sum>=11&&sum<=30){
            System.out.println("selfish!");
        }
        else if (sum>31){
            System.out.println("super selfish!");
        }
    }
}
