import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = reader.nextInt();

        int counter = 1;
        int sum = 1;

        while (counter <= num) {
            sum = counter * sum;
            counter++;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
