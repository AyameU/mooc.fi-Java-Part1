import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Bird> birds;
    private Scanner scanner;

    public Database() {
        this.birds = new ArrayList<Bird>();
    }

    public void commands(Scanner scanner) {
        if(scanner.equals("Add")) {
            add(scanner);
        }
        else if(scanner.equals("Observation")) {
            observation(scanner);
        }
        else if(scanner.equals("Statistics")) {
            statistics();
        }
        else if(scanner.equals("Show")) {
            show(scanner);
        }
        else if(scanner.equals("Quit")) {
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
        System.out.println(birds);
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
            else {
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
        System.out.println("What? ");
        String what = scanner.nextLine();

        // loop through objects in arraylist
        // if user input equals an object in arraylist, print object
        for(Bird bird : birds) {
            if(bird.getName().equals(what)) {
                System.out.println(bird);
            }
            else {
                System.out.println("Is not a bird!");
            }
        }
    }

    public void quit() {
        System.exit(0);
    }
}
