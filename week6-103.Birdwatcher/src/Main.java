import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database birds = new Database();

        System.out.println("Commands: Add, Observation, Statistics, Show, Quit");

        // ask for user input
        // check what the user input is
        // run methods based on input

        while(!scanner.equals("Quit")) {
            System.out.print("? ");
            String command = scanner.nextLine();
            birds.commands(command, scanner);
            if(command.equals("Quit")) {
                break;
            }
        }
    }

}
