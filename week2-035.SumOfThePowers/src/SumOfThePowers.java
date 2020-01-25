
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = reader.nextInt();

        int counter = 0;
        int result = 0;

        while (counter <= number) {
            result = result + (int)Math.pow(2, counter);
            counter++;
        }
        System.out.println("The result is " + result);
    }
}
