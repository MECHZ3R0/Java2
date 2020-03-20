package fifthpackage;

public class MovieDecision {
    public static void main(String[] args) {
        System.out.println(whatToDo(5.6,84500,154000.9));
    }
    public static String whatToDo(double imdbScore,int totalVotes,double boxOffice){
        if (imdbScore*totalVotes/boxOffice>10){
            return "Watch movie";
        }
        else{
            return "Do not watch movie";
        }
    }
}
