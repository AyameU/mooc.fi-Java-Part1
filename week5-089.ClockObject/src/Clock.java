public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {

        // initialize vars with new object, and the upper limit
        hours = new BoundedCounter(23);
        // set the value in the BoundedCounter otherwise it stays 0
        hours.setValue(hoursAtBeginning);

        minutes = new BoundedCounter(59);
        minutes.setValue(minutesAtBeginning);

        seconds = new BoundedCounter(59);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        seconds.next();
        if(seconds.getValue() == 0) {
            minutes.next();
            if(minutes.getValue() == 0) {
                hours.next();
            }
        }
    }
    
    public String toString() {
        // returns the string representation
        return hours.toString() + ":" + minutes.toString() + ":" + seconds.toString();
    }
}
