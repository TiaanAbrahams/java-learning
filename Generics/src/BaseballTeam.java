import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {
    private String teamName;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseballPlayer player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + "Roster: ");
        for(var player: teamMembers){
            System.out.printf("Name : %s Position: %s%n".formatted(player.name(),player.position()));
        }
    }

    public int ranking(){
        return (totalLosses *2) + totalTies +1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "Loss Score";
        if(ourScore > theirScore){
            totalWins++;
            message = "Beat";
        }else if(ourScore == theirScore){
            totalTies++;
            message = "d";
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
