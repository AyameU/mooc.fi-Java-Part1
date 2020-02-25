import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    // constructor

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>(16);
        this.maxSize = 16;
    }

    public Team(String name, int maxSize) {
        this.name = name;
        this.players = new ArrayList<Player>(16);
        this.maxSize = maxSize;
    }

    // getter
    public String getName() {
        return this.name;
    }

    // methods

    public void addPlayer(Player player) {
        if(players.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        String printPlayers = "";
        for(Player player : this.players) {
            printPlayers += "" + player.toString() + "\n";
        }
        System.out.println(printPlayers);
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int totalGoals = 0;
        for(Player player : this.players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }

    // setter

    public void setMaxSize(int maxSize) {
       this.maxSize = maxSize;
    }

}
