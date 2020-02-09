
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        if(!this.guessedLetters.contains(letter)) {
            if(this.word.contains(letter)) {
                this.guessedLetters = this.guessedLetters + letter;
            }
            else {
                this.numberOfFaults++;
                this.guessedLetters = this.guessedLetters + letter;
            }
        }

    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        String hiddenWord = "";
        int i = 0;

        // create the hidden word by interating through this.word letter by letter
        while(i < this.word.length()) {

            char character = this.word.charAt(i);
            String charString = "" + character;

            // if the letter in turn is within the guessed words, put it in to the hidden word
            if(this.guessedLetters.contains(charString)) {
                hiddenWord = hiddenWord + charString;
            }
            else {
                hiddenWord = hiddenWord + "_";
            }
            i++;
        }

        // return the hidden word at the end
        return hiddenWord;
    }
}
