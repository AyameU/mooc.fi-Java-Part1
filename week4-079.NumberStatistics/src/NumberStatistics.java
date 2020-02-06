public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    // constructor
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    // methods
    public void addNumber(int number) {
        number = number;
        this.sum = sum + number;

        // Oh my god, duh. The answer is literally staring me in the face.
        // Instead of iterating number + 1, which screws up the sum method,
        // I can iterate the amountOfNumbers variable, that's literally what the
        // variable was created for. Ugh, ugh. Can't believe that took me so long
        // to figure out. So simple!
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
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
            return (double) this.sum / this.amountOfNumbers;
        }
    }
}