package Soccer;

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    public Game(Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
}
