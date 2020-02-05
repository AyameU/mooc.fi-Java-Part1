public class BoundedCounter {
    private int value;
    private int upperLimit;

    // constructor
    public BoundedCounter(int upperLimit) {
    this.value = 0;
    this.upperLimit = upperLimit;
    }

    //methods

    public void next() {
        if(this.value >= this.upperLimit) {
            this.value = 0;
        }
        else {
            this.value++;
        }
    }

    public String toString() {
        if(this.value < 10) {
            return "0" + this.value;
        }
        else {
            return "" + this.value;
        }
    }
}
