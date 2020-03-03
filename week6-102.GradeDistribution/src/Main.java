import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeDistribution scores = new GradeDistribution(0);

        int examScore = 0;

        System.out.println("Type exam scores, -1 completes:");
        while(examScore != -1) {
            examScore = Integer.parseInt(scanner.nextLine());
            if(examScore != -1) {
                scores.addScore(examScore);
            }
        }
        scores.printGradeDistribution();
    }
}
