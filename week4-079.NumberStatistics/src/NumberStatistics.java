public class NumberStatistics {
    private int amountOfNumbers;
    private int counter;
    private int sum;
    private double average;

    // constructor
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.counter = 0;
        this.sum = 0;
        this.average = 0;
    }

    // methods
    public void addNumber(int number) {
        number = number;
        this.sum = sum + number;
        this.counter++;
    }

    public int amountOfNumbers() {
        amountOfNumbers = this.counter;
        return amountOfNumbers;
    }

    public int sum() {
        if(amountOfNumbers() == 0) {
            return 0;
        }
        else {
            return sum;
        }
    }

    public double average() {
        if(amountOfNumbers() == 0) {
            return 0.0;
        }
        else {
            average = (double) this.sum / this.amountOfNumbers;
            return average;
        }
    }
}