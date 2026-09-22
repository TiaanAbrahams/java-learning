
interface Player{}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreResult(phillies, 3,astros,5);

        SportsTeam phillies1 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros1 = new SportsTeam("Houston Astros");
        scoreResult(phillies1, 3,astros1,5);

        BaseballPlayer herper = new BaseballPlayer("TB Harper", "Right Fielder");
        BaseballPlayer march = new BaseballPlayer("B March", "Right Fielder");

        phillies.addTeamMember(herper);
        phillies.addTeamMember(march);
        phillies.listTeamMembers();

        SportsTeam afc = new SportsTeam("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker","Centre Halfback");

        afc.addTeamMember(tex);
        afc.listTeamMembers();

        //No type checking using the interface design
        var guthrie = new BaseballPlayer("Guthrie", "Fielder");
        afc.addTeamMember(guthrie);
        afc.listTeamMembers();


    }
    //Method for BaseballPlayer
    public static void scoreResult(BaseballTeam team1 , int t1_score,
                                   BaseballTeam team2 , int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    //Method for SportsTeam
    public static void scoreResult(SportsTeam team1 , int t1_score,
                                   SportsTeam team2 , int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}