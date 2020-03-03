import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<Bird>();
    }

    public void commands(String command, Scanner scanner) {
        if(command.equals("Add")) {
            add(scanner);
        }
        else if(command.equals("Observation")) {
            observation(scanner);
        }
        else if(command.equals("Statistics")) {
            statistics();
        }
        else if(command.equals("Show")) {
            show(scanner);
        }
        else if(command.equals("Quit")) {
            quit();
        }
    }

    public void add(Scanner scanner) {
        // get user input
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        System.out.print("Latin Name: ");
        String birdLatinName = scanner.nextLine();

        // create new Bird object from user input
        Bird bird = new Bird(birdName, birdLatinName);

        // add new Object to ArrayList
        birds.add(bird);
    }

    public void observation(Scanner scanner) {
        // get user input
        System.out.print("What was observed:? ");
        String observation = scanner.nextLine();

        // loop thru arraylist, checking if input matches object
        for(Bird bird : birds) {
            if(bird.getName().equals(observation)) {
                bird.observation();
            }
            else if(!(bird.getName().equals(observation))) {
                System.out.println("Is not a bird!");
            }
        }
    }

    public void statistics() {
        for(Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void show(Scanner scanner) {
        // get user input
        System.out.print("What? ");
        String what = scanner.nextLine();

        // loop through objects in arraylist
        // if user input equals an object in arraylist, print object
        for(Bird bird : birds) {
            if(bird.getName().equals(what)) {
                System.out.println(bird);
            }
            if(!(bird.getName().equals(what))) {
                System.out.println("Is not a bird!");
            }
        }
    }

    public void quit() {
        System.exit(0);
    }
}
