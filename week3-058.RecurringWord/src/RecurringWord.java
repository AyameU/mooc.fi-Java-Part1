
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = reader.nextLine();
        words.add(word);

        // Start loop, asking for input
        while(true) {
            System.out.println("Type a word: ");
            word = reader.nextLine();

            // Check if new input is already in array
            if(words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break;
            }

            // if not in array, add word to array and keep looping
            else {
                words.add(word);
            }
        }
    }
}
