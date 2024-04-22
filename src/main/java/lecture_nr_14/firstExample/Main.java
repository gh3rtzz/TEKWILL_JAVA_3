package lecture_nr_14.firstExample;

public class Main {

    public static void main(String[] args) {

        FootBallPlayer player1 = new FootBallPlayer("Lionel", "Messi");
        FootBallPlayer player2 = new FootBallPlayer("Cristiano", "Ronaldo");
        FootBallPlayer player3 = new FootBallPlayer("Luka", "Mudric");
        FootBallPlayer player4 = new FootBallPlayer("Ibragimovic", "Zlato");
        FootBallPlayer player5 = new FootBallPlayer("David", "Backham");

        BasketBallPlayer bbPlayer1 = new BasketBallPlayer("Kobe");
        BasketBallPlayer bbPlayer2 = new BasketBallPlayer("Michael");

        SportsTeam<FootBallPlayer> team1 = new SportsTeam<>("Real Madrid");
        SportsTeam<FootBallPlayer> team2 = new SportsTeam<>("Manchester United");

        team1.addTeamMembers(player1);
        team1.addTeamMembers(player2);
        team1.addTeamMembers(player3);

        team2.addTeamMembers(player4);
        team2.addTeamMembers(player5);

        SportsTeam<BasketBallPlayer> team3 = new SportsTeam<>("Yankees");

        team3.addTeamMembers(bbPlayer1);
        team3.addTeamMembers(bbPlayer2);

        // ----------------- SEASON STARTED:

        team1.incrementWins();
        team2.incrementWins();
        team1.incrementWins();
        team1.incrementWins();
        team1.incrementWins();
        team2.incrementLosses();
        team2.incrementLosses();
        team2.incrementLosses();
        team1.incrementTies();

        System.out.println(team1.showRank());
        System.out.println(team2.showRank());

        team3.incrementTies();
        team3.incrementTies();
        team3.incrementTies();
        team3.incrementWins();
        team3.incrementLosses();

        System.out.println(team3.showRank());

//        SportsTeam<String> stringTeam = new SportsTeam<>(); Won't Compile
    }
}
