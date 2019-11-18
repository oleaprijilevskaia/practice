package generics_task;
//Create a generic class to implement a league table for any type of sport.
// The class should allow teams to be added to the list, and store a list of teams that belong to this particular league.
//Your class should have a method to print out the teams by name alphabetical.
//Only teams of the same type should be added to any particular instance of the league class - the program  should
// fail to compile if an attempt is made to add an incompatible team.
public class Main {
    public static void main(String[] args) {

        Football barcelona = new Football("Barcelona");
        Football realMadrid = new Football("Real Madrid");
        Basketball clevelandCavaliers = new Basketball("Cleveland Cavaliers");
        Basketball admirals = new Basketball("Admirals");

        League<Football> leagueFootball = new League<Football>();
        League<Basketball> leagueBasketball = new League<Basketball>();

        leagueBasketball.add(admirals);
        leagueBasketball.add(clevelandCavaliers);
        //We cannot to add football team in basketball league
        //leagueBasketball.add(barcelona);
        leagueFootball.add(barcelona);
        leagueFootball.add(realMadrid);
        System.out.println("Basketball teams:");
        leagueBasketball.printList();
        System.out.println("Football teams:");
        leagueFootball.printList();

        ;


    }
}
