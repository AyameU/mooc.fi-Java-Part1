
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number: ");
        int upToNum = reader.nextInt();

        int number = 0;

        while (number < upToNum) {
            number++;
            System.out.println(number);
        }
    }
}
