
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        System.out.println("Enter the password: ");
        String userPassword = reader.nextLine();

        while(!(userPassword.equals("carrot"))) {
            System.out.println("Wrong!");
            System.out.println("Enter the password: ");
            userPassword = reader.nextLine();
        }

        System.out.println("Right!");
        System.out.println("The secret is: Hello World!");
    }
}
