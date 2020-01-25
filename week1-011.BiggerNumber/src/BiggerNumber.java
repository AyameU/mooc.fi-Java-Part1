
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num1 = reader.nextInt();

        System.out.println("Type a second number: ");
        int num2 = reader.nextInt();

        int result = Math.max(num1, num2);

        System.out.println("The bigger of the two numbers given was: " + result);
    }
}
