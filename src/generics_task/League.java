package generics_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class League<T extends SportTeam> {

    List<T> leagueTeamsList = new ArrayList<>();

    public void add(T team){
        leagueTeamsList.add(team);
    }

    public void printList(){
        leagueTeamsList.sort(Comparator.comparing(T::getTeamName));
        for (int i = 0; i <leagueTeamsList.size() ; i++) {
            System.out.printf(leagueTeamsList.get(i).getTeamName()+ ", ");
        }
        System.out.println();
    }
}
