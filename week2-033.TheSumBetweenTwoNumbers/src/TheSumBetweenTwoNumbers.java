
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = reader.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = reader.nextInt();

        int counter = num1 + 1;
        int sum = num1;

        while (counter <= num2) {
            sum += counter;
            counter++;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
