package lecture_nr_14.firstExample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SportsTeam<T extends Player & CanConductTraining>{

    private String name;
    private List<T> roster = new ArrayList<>();

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public SportsTeam(String name) {
        this.name = name;
    }

    public void addTeamMembers(T inputPlayer){

        roster.add(inputPlayer);
    }

    public void incrementWins(){

        totalWins++;
    }

    public void incrementLosses(){

        totalLosses++;
    }

    public void incrementTies(){

        totalTies++;
    }

    public String showRank(){

        return "Ranking of team: " + name + " is: " + (totalWins - (totalLosses * 2));
    }

    @Override
    public String toString() {
        return "SportsTeam{" +
                "name='" + name + '\'' +
                ", roster=" + roster +
                ", totalWins=" + totalWins +
                ", totalLosses=" + totalLosses +
                ", totalTies=" + totalTies +
                '}';
    }
}
