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

    // Getter

    /*
    This getter is needed because it can be accessed by other classes unlike the other
    variables in this class. Without this getter I can't validate the variable with
    'minutes.getValue() == 0' in Main. Kept giving me an error. Also we do not need to pass
    a parameter through this getter. Again, it's just making an existing variable public to
    outside classes.
    */
    public int getValue() {
        return value;
    }

    // Setter Method

    public void setValue(int value) {
        if(value < 0 || value > upperLimit) {
        }
        else {
            this.value = value;
        }
    }
}
