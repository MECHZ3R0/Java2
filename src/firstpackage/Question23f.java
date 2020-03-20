package firstpackage;

import java.util.Scanner;

public class Question23f {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Math or Art?:");
        String n = x.nextLine();
        switch(n) {
            case "Math":
                System.out.println("Tutor?: (Yes/No)");
                String nx = x.nextLine();
                String output = (nx.equalsIgnoreCase("Yes"))?"Ok":"Study yourself";
                System.out.println(output);
                break;
            case "Art":
                System.out.println("Nice Choice");
                break;
            default:
                System.out.println("No info!");
                break;

        }}}