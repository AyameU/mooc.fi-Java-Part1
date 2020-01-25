
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = reader.nextInt();
        num1 = num1 - 1;

        System.out.println("Enter a second number: ");
        int num2 = reader.nextInt();

        if (num1 > num2) {
        }
        else {
            while (num1 < num2) {
                num1++;
                System.out.println(num1);
            }
        }
    }
}
