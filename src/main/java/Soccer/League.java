package Soccer;

import java.util.Arrays;

public class League {
    public static void main(String[] args) {

        Team[] theTeam = createTeams();
        Game[] theGame = createGames(theTeam);
        Game currGame = theGame[0];

//        Player player1 = new Player();
//        player1.playerName = "Graham Eliot";
//        Player player2 = new Player();
//        player2.playerName = "Graham Greene";
//        Player player3 = new Player();
//        player3.playerName = "Graham Chaucer";
//
//
//
//        Player[] playerArray = {player1, player2, player3};
//        player1.playerName = "Robert Service";
//
//        for (Player thePlayer1 : thePlayers.playerArray) {
//            System.out.println(thePlayer1.playerName);
//        }
//        for (Player thePlayer2 : team2.playerArray) {
//            System.out.println(thePlayer2.playerName);
//        }

        Goal goal1 = new Goal();
        goal1.player = currGame.homeTeam.playerArray[2];
        goal1.team = currGame.homeTeam;
        goal1.theTime = 55;
        Goal goal2 = new Goal();
        goal2.player = currGame.homeTeam.playerArray[1];
        goal2.team = currGame.homeTeam;
        goal2.theTime = 20;
        Goal goal3 = new Goal();
        goal3.player = currGame.homeTeam.playerArray[0];
        goal3.team = currGame.homeTeam;
        goal3.theTime = 45;

        Goal[] theGoal = {goal1, goal2, goal3};
        currGame.goals = theGoal;

        for (int i = 0; i < theGoal.length; i++) {
            System.out.println("Goal scored after " + currGame.goals[i].theTime + " mins by " + currGame.goals[i].player.playerName + " of " + currGame.goals[i].team.teamName);
        }
    }

        public static Team[] createTeams () {
            Team team1 = new Team();
            team1.teamName = "The Greens";
            team1.playerArray = new Player[3];
            team1.playerArray[0] = new Player();
            team1.playerArray[0].playerName = "Graham Eliot";
            team1.playerArray[1] = new Player();
            team1.playerArray[1].playerName = "Graham Greene";
            team1.playerArray[2] = new Player();
            team1.playerArray[2].playerName = "Graham Chaucer";


            Team team2 = new Team();
            team2.teamName = "The Reds";
            team2.playerArray = new Player[3];
            team2.playerArray[0] = new Player();
            team2.playerArray[0].playerName = "Robert Service";
            team2.playerArray[1] = new Player();
            team2.playerArray[1].playerName = "Robbie Burns";
            team2.playerArray[2] = new Player();
            team2.playerArray[2].playerName = "Rafael Sabatini";

            Team[] theTeams = {team1, team2};
            return theTeams;
        }
        public  static Game[] createGames(Team[] theTeams){
            Game currGame = new Game();
            currGame.homeTeam = theTeams[0];
            currGame.awayTeam = theTeams[1];
            Game[] games = {currGame};
            return games;
        }
}
