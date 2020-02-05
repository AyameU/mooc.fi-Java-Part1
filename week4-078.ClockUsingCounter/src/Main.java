
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);

            // put here the logic to advance your clock by one second
            seconds.next();

            // if seconds become zero, advance minutes
            if(seconds.getValue() == 0) {
                minutes.next();

                // if minutes become zero, advance hours
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }
    }
}