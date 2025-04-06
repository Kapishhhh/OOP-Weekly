package question2;

//player Stats

public class PlayerStats {
    protected String playerName;
    protected String team;

    public PlayerStats(String playerName) {
        this.playerName = playerName;
    }
    

    @Override
    public String toString() {
        return "Player Name: " + playerName;
    }
}

