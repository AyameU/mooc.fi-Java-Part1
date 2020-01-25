
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int upToNum = reader.nextInt();

        int number = 0;
        int count = 0;

        while (count <= upToNum) {
            number += count;
            count++;
        }
        System.out.println(number);
    }
}
