package accessmodifiers;

public class Interview {
    private String name;
    private int score;
    private boolean decision;
    private int pointsJava;
    private int pointsSQL;
    private int pointsSoftSkills;

    public Interview(String name) {
        this.name=name;
        this.score=0;
        this.decision=false;
        this.pointsJava=0;
        this.pointsSQL=0;
        this.pointsSoftSkills=0;
    }

    public void setPointsJava(int pointsJava) {
        this.pointsJava = pointsJava;
    }

    public void setPointsSQL(int pointsSQL) {
        this.pointsSQL = pointsSQL;
    }

    public void setPointsSoftSkills(int pointsSoftSkills) {
        this.pointsSoftSkills = pointsSoftSkills;
    }
    public void setScore(){
        score = pointsJava+pointsSQL+pointsSoftSkills;
    }
    public int getScore(){
        return score;
    }
    public boolean isDecision(){
        if (score>500){
            System.out.println("Offer");
            decision=true;
            return decision;
        }
        else {
            System.out.println("Alternative");
            return decision;}
    }

    @Override
    public String toString() {
        return "Interview{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", decision=" + decision +
                ", pointsJava=" + pointsJava +
                ", pointsSQL=" + pointsSQL +
                ", pointsSoftSkills=" + pointsSoftSkills +
                '}';
    }
}
