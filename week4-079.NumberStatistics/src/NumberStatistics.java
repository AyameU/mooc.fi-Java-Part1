public class NumberStatistics {
    private int amountOfNumbers;
    private int number;

    // constructor
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.number = 0;
    }

    // methods
    public void addNumber(int number) {
        this.number++;
    }

    public int amountOfNumbers() {
        amountOfNumbers = this.number;
        return amountOfNumbers;
    }
}
