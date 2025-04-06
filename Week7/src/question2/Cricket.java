package question2;

//Cricket class

public class Cricket extends PlayerStats {
    private int runs;
    private String wickets;

    public Cricket(String playerName, int runs, String wickets) {
        super(playerName);
        this.runs = runs;
        this.wickets = wickets;
    }

    public void displayCricketStats() {
        System.out.println(playerName + " has scored " + runs + " runs and taken " + wickets + " wickets.");
    }
}

