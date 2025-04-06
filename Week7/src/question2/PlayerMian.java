package question2;

//Derived Classs

public class PlayerMian {
    public static void main(String[] args) {
        Football footballPlayer = new Football("Kapish", 25, 50);
        Cricket cricketPlayer = new Cricket("Stokes", 500, "10");

        System.out.println(footballPlayer);
        footballPlayer.displayFootballStats();

        System.out.println(cricketPlayer);
        cricketPlayer.displayCricketStats();
    }
}