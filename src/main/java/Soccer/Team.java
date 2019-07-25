package Soccer;

public class Team {
    public String teamName;
    public Player[] playerArray;

    public Team(String teamName){
        this.teamName = teamName;
    }
    public Team(String teamName, Player[] players){
        this(teamName);
        this.playerArray = players;
    }
}
