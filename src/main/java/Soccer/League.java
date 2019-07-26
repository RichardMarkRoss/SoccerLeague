package Soccer;

import java.util.Arrays;

public class League {
    public static void main(String[] args) {

        Team[] theTeam = createTeams();
        Game[] theGame = createGames(theTeam);
        Game currGame = theGame[0];

//        int numberOfGoals = (int)(Math.random() * 7);

        Goal goal1 = new Goal();
        goal1.player = currGame.awayTeam.playerArray[2];
        goal1.team = currGame.awayTeam;
        goal1.theTime = 55;
        Goal goal2 = new Goal();
        goal2.player = currGame.awayTeam.playerArray[1];
        goal2.team = currGame.awayTeam;
        goal2.theTime = 20;
        Goal goal3 = new Goal();
        goal3.player = currGame.awayTeam.playerArray[0];
        goal3.team = currGame.awayTeam;
        goal3.theTime = 45;

        Goal[] theGoal = {goal1, goal2, goal3};
        currGame.goals = theGoal;
        for (int i = 0; i < currGame.goals.length; i++) {
            System.out.println("Goal scored after " + currGame.goals[i].theTime + " mins by " + currGame.goals[i].player.playerName + " of " + currGame.goals[i].team.teamName);
        }
    }

        public static Team[] createTeams () {

            Player player1 = new Player("Graham Eliot");
            Player player2 = new Player("Graham Greene");
            Player player3 = new Player("Graham Chaucer");
            Player[] playerArray = {player1, player2, player3};
            Team team1 = new Team("The Greens",playerArray);

            Team team2 = new Team("The Reds");
            team2.playerArray = new Player[3];
            team2.playerArray[0] = new Player("Robert Service");
            team2.playerArray[1] = new Player("Robbie Burns");
            team2.playerArray[2] = new Player("Rafael Sabatini");

            return new Team[]{team1, team2};
        }
        public  static Game[] createGames(Team[] theTeams){
            Game theGame = new Game(theTeams[0],theTeams[1]);
            Game theGame2 = new Game(theTeams[0],theTeams[1]);
            Game[] theGames = {theGame, theGame2};
            return theGames;
        }
}
