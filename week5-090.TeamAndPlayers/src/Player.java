public class Player {
    private String name;
    private int amountOfGoals;

    // constructors

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int amountOfGoals) {
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }

    // getters

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.amountOfGoals;
    }

    public String toString() {
        return getName() + ", goals " + this.amountOfGoals;
    }
}
