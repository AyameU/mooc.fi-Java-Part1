
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        int num3 = num1 + num2;
        System.out.println("Sum of numbers:" + num3);
    }
}
