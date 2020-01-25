
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = reader.nextLine();

        System.out.println("Number of characters: ");
        System.out.println(calculateCharacters(name));
    }

    public static int calculateCharacters(String name) {

        int number = name.length();
        return number;
    }
    
}
