import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your first name: ");
        String firstCharacter = reader.nextLine();

        System.out.println("First character: " + firstCharacter(firstCharacter));
    }

    public static char firstCharacter(String firstCharacter) {
        char character = firstCharacter.charAt(0);
        return character;
    }

    /* Remember, the method passes the "firstCharacter" parameter. That parameter name is predefined.
    That means the variable name of the input string in Main *must* have the same name.
     Don't make up your own variable name. */
}