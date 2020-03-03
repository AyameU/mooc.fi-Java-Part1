import java.util.ArrayList;

public class GradeDistribution {
    private int score;
    private ArrayList<Integer> scores;
    private int[] gradeDistribution = {0,0,0,0,0,0};
    private int acceptedScores;
    private int allEnteredScores;

    public GradeDistribution(int score) {
        this.score = score;
        this.scores = new ArrayList<Integer>();
        this.acceptedScores = 0;
        this.allEnteredScores = 0;
    }

    public void addScore(int score) {

        if(score > 0 && score <= 60) {
            this.scores.add(score);
            allEnteredScores++;
        }
    }

    public double percentage() {
        double percentage = 0.0;
        if(acceptedScores > 0) {
            percentage = (100 * acceptedScores) / allEnteredScores;
        }
        return percentage;
    }

    public void printGradeDistribution() {

        // sort scores into printGradeDistribution array
        for(int score : scores) {
            if(score > 0 && score <= 60) {
                if(score > 0 && score <= 29) {
                    gradeDistribution[0]++;
                }
                else if(score >= 30 && score <= 34) {
                    gradeDistribution[1]++;
                    acceptedScores++;
                }
                else if(score >= 35 && score <= 39) {
                    gradeDistribution[2]++;
                    acceptedScores++;
                }
                else if(score >= 40 && score <= 44) {
                    gradeDistribution[3]++;
                    acceptedScores++;
                }
                else if(score >= 45 && score <= 49) {
                    gradeDistribution[4]++;
                    acceptedScores++;
                }
                else if(score >= 50 && score <= 60) {
                    gradeDistribution[5]++;
                    acceptedScores++;
                }
            }
        }

        // Create Stars
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for(int k = 0; k < gradeDistribution[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Acceptance percentage: " + percentage());
    }
}
