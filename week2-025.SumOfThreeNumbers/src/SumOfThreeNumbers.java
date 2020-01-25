
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        System.out.println("Enter a number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Enter a second number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Enter a third number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Sum: " + sum);
    }
}
