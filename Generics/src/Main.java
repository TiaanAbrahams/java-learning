
interface Player{}
record BaseballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");

        BaseballPlayer herper = new BaseballPlayer("TB Harper", "Right Fielder");
        BaseballPlayer march = new BaseballPlayer("B March", "Right Fielder");

        phillies.addTeamMember(herper);
        phillies.addTeamMember(march);

        phillies.listTeamMembers();

        scoreResult(phillies, 3,astros,5);
    }

    public static void scoreResult(BaseballTeam team1 , int t1_score,
                                   BaseballTeam team2 , int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}