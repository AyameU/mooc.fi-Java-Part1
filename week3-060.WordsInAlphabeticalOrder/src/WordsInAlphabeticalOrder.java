
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type in a word: ");
        String word = reader.nextLine();
        words.add(word);

        while(!word.isEmpty()) {
            System.out.println("Type in a word: ");
            word = reader.nextLine();
            words.add(word);
        }

        Collections.sort(words);

        System.out.println("You typed the following words: ");
        for(String wordCount : words) {
            System.out.println(wordCount);
        }
    }
}