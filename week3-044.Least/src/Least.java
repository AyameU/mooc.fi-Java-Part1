
public class Least {

    public static int least(int number1, int number2) {

        int leastNum = 0;

        if(number1 < number2) {
            leastNum = number1;
        }
        else {
            leastNum = number2;
        }
        return leastNum;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
