package Soccer;

public class League {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.playerName = "Graham Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Graham Chaucer";

        Player[] thePlayers = {player1, player2, player3};
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        player1.playerName = "Robert Service";
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        for(Player thePlayer1 : team1.playerArray){
            System.out.println(thePlayer1.playerName);
        }
        for(Player thePlayer2 : team2.playerArray){
            System.out.println(thePlayer2.playerName);
        }
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.player = currGame.homeTeam.playerArray[2];
        goal1.team = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoal = {goal1};
        currGame.goals = theGoal;

            System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by " + currGame.goals[0].player.playerName + " of " + currGame.goals[0].team.teamName);
        
    }
}
