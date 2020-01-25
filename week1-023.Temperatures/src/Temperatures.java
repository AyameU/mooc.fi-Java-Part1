import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a temperature: ");
        double number = reader.nextDouble();
        if( number > -30 && number < 40) {
            Graph.addNumber(number);
        }
        else {
            System.out.println("Temperature must be between -30 degrees and 40 degrees");
        }

        while(true) {
            System.out.println("Enter a temperature: ");
            number = reader.nextDouble();
            if( number > -30 && number < 40) {
                Graph.addNumber(number);
            }
            else {
                System.out.println("Temperature must be between -30 degrees and 40 degrees");
            }
        }

        // Graph is used as follows:
        // Graph.addNumber(7);
        // double value = 13.5;
        // Graph.addNumber(value);
        // value = 3;
        // Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}