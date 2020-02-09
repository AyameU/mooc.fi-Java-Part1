public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("Dosimeter");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
