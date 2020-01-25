import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten players based on goals scored: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 players based on penalty amounts: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby's Stats: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Philadelphia Flyer's Stats: ");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Anaheim Duck's Players: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

        System.out.println("Winnipeg Jets Stats: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("WPG");
    }
}
