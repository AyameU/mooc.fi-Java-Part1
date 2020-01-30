import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = reader.nextLine();
        words.add(word);

        // asks user for input until they enter an empty string
        while(!word.isEmpty()) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }

        // loops through the array and prints each one in reverse order
        Collections.reverse(words);
        for(String w : words) {
            System.out.println(w);
        }
    }
}
