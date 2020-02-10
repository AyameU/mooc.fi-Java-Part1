public class Counter {
    private int startingValue;
    private boolean check;

    // Constructors

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.check = check;
    }

    public Counter() {
        this(0);
        this.check = false;
    }

    // Methods

    public int value() {
        // returns the current value of the counter
        return this.startingValue;
    }

    public void increase() {
        // increases the value of the counter by one
        this.startingValue++;
    }

    public void decrease() {
        // decreases the value of the counter by one, but not below 0 if the check is on
        if(this.check && this.startingValue >= 1) {
            this.startingValue--;
        }
        else if(!this.check) {
            this.startingValue--;
        }
    }

    // Parameterised Methods

    public void increase(int increaseAmount) {
        // increases the value of the counter by one
        // If the value of the parameter is negative, the value will not change.
        if(increaseAmount < 0) {
            // Do nothing
        }
        else {
            this.startingValue = this.startingValue + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        // If the value of the parameter is negative, the value of the counter will not change.
        if(decreaseAmount < 0) {
            // Do nothing
        }
        else {
            // decreases the value of the counter by the amount given by the parameter
            // but not below 0 if the check is on
            if(this.check && this.startingValue >= decreaseAmount) {
                this.startingValue = this.startingValue - decreaseAmount;
            }
            else if(this.check && this.startingValue < decreaseAmount) {
                this.startingValue = 0;
            }
            else if(!this.check) {
                this.startingValue = this.startingValue - decreaseAmount;
            }
        }
    }
}
