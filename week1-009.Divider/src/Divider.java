
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        float division = (float)num1 / num2;
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
    }
}
