import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        int average;
        boolean greater;
        int i = 0;

        while(i < howManyTimesHalvable(average(lowerLimit, upperLimit))) {

                if(lowerLimit == upperLimit) {
                    break;
                }

                average = this.average(lowerLimit, upperLimit);
                greater = this.isGreaterThan(average);

                if(greater) {
                    lowerLimit = average + 1;
                }
                else {
                    upperLimit = average;
                }
        }
        System.out.println("The number you're thinking of is " + upperLimit + ".");
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answer = this.reader.nextLine();
        if(answer.equals("y")) {
            return true;
        }
        return false;
    }

    public int average(int firstNumber, int secondNumber) {
        int average = (firstNumber + secondNumber) / 2;
        return average;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
