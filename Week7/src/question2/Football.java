package question2;

//Football	

public class Football extends PlayerStats {
    private int goals;
    private int assists;

    public Football(String playerName, int goals, int assists) {
        super(playerName);
        this.goals = goals;
        this.assists = assists;
    }

    public void displayFootballStats() {
        System.out.println(playerName + " has scored " + goals + " goals and made " + assists + " assists.");
    }
}