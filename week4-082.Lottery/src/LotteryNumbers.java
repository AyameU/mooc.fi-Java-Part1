import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();

        while(this.numbers.size() < 7) {
            // Random should be initialized in this method, not in the constructor
            // otherwise it won't work
            int num = new Random().nextInt(39) + 1; // Add 1 to make range 1-39
            if(!containsNumber(num)) {
                this.numbers.add(num);
            }
        }
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)) {
            return true;
        }
        else {
            return false;
        }
    }
}
