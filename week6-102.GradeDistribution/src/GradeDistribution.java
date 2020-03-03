import java.util.ArrayList;

public class GradeDistribution {
    private int score;
    private ArrayList<Integer> scores;
    private int[] gradeDistribution = {0,0,0,0,0,0};
    private int acceptedScores;
    private int allEnteredScores;

    public GradeDistribution(int score) {
        this.score = score;
        this.scores = new ArrayList<>();
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
        return (100 * acceptedScores) / allEnteredScores;
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


    /*
    private int score;
    private ArrayList<Integer> allScores;
    private ArrayList<ArrayList<Integer>> allGrades;
    private ArrayList<Integer> grade0;
    private ArrayList<Integer> grade1;
    private ArrayList<Integer> grade2;
    private ArrayList<Integer> grade3;
    private ArrayList<Integer> grade4;
    private ArrayList<Integer> grade5;

    public GradeDistribution(int score) {
        this.score = score;
        this.allScores = new ArrayList<>();
        this.allGrades  = new ArrayList<>();
        this.grade0  = new ArrayList<>();
        this.grade1  = new ArrayList<>();
        this.grade2  = new ArrayList<>();
        this.grade3  = new ArrayList<>();
        this.grade4  = new ArrayList<>();
        this.grade5  = new ArrayList<>();

        allGrades.add(this.grade0);
        allGrades.add(this.grade1);
        allGrades.add(this.grade2);
        allGrades.add(this.grade3);
        allGrades.add(this.grade4);
        allGrades.add(this.grade5);
    }

    public void addScore(int score) {
        this.allScores.add(score);
    }

    public void printScores() {
        for(int score : allScores) {
            System.out.println(score);
        }
    }

    public double percentage() {
        int percentage = 0;
        for(int score : allScores) {
            percentage += score;
        }
        return percentage / allScores.size();
    }

    public void distributeGrades() {
        for(int score : allScores) {
            if(score > 0 && score <= 60) {
                if(score > 0 && score <= 29) {
                    this.grade0.add(score);
                }
                else if(score >= 30 && score <= 34) {
                    this.grade1.add(score);
                }
                else if(score >= 35 && score <= 39) {
                    this.grade2.add(score);
                }
                else if(score >= 40 && score <= 44) {
                    this.grade3.add(score);
                }
                else if(score >= 45 && score <= 49) {
                    this.grade4.add(score);
                }
                else if(score >= 50 && score <= 60) {
                    this.grade5.add(score);
                }
            }
        }
    }

    public String stars(ArrayList<Integer> arraylist) {
        distributeGrades();
        String stars = "";
        for(int i = 0; i < arraylist.size(); i++) {
            stars += "*";
        }
        return stars;
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        int i = allGrades.size() - 1;
        for(ArrayList<Integer> array : allGrades) {
            System.out.println(i + ": " + stars(array));
            i--;
        }
        System.out.println("Acceptance percentage: " + percentage());
    }
    */
}
