package dateTimeApi_task;

import java.time.*;

//Create a generic class to implement a league table for any type of sport.
//  The class should allow teams to be added to the list, and store a list of teams that belong to this particular league.
//
// Your class should have a method to print out the teams by name alphabetical.
//Only teams of the same type should be added to any particular instance of the
// league class - the program should fail to compile if an attempt is made to add an incompatible team.
public class Main {
    public static void main(String[] args) {
        ZonedDateTime lax = ZonedDateTime.of(LocalDateTime.parse("2019-11-11T06:00"), ZoneId.of("America/Los_Angeles"));
        ZonedDateTime syd = ZonedDateTime.of(LocalDateTime.parse("2019-11-11T11:15"), ZoneId.of("Australia/Sydney"));
        Duration duration = Duration.between(lax, syd);
        System.out.println("Flight time:" + duration);

        CountTime starWars = new CountTime(25,5,1977);
        starWars.dayOfWeek();
        starWars.countTimeInYear(2);
        starWars.ConvertSectorDay(1);
        starWars.countTimeInYearBonus(2);




    }
}
