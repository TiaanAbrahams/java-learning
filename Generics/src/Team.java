import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String teamName;
    private List<Player> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Player player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLosses *2) + totalTies +1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "Lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "Beat";
        }else if(ourScore == theirScore){
            totalTies++;
            message = "Tied";
        }else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + "(Ranked: %d)".formatted(ranking());
    }
}
