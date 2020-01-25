import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = reader.nextInt();

        System.out.println("Enter a second number: ");
        int num2 = reader.nextInt();

        if(num1 > num2) {
            System.out.println("Greater number: " + num1);
        }
        else if(num1 < num2) {
            System.out.println("Greater number: " + num2);
        }
        else {
            System.out.println("The numbers are equal!");
        }

    }
}
