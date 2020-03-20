package accessmodifiers;

public class InterviewTest {
    public static void main(String[] args) {
        Interview x = new Interview("Sample");
        System.out.println(x.toString());
        x.setPointsJava(200);
        x.setPointsSQL(200);
        x.setPointsSoftSkills(200);
        x.setScore();
        System.out.println(x.getScore());
        x.isDecision();
        System.out.println(x.toString());
    }
}
