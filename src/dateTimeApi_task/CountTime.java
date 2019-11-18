package dateTimeApi_task;

import java.time.*;
import java.util.concurrent.TimeUnit;

public class CountTime {
    private int year;
    private int month;
    private int day;
    private LocalDate primeDate;
    private int value;


    public CountTime(int day, int month, int year) {
        this.day = day;
        this.year = year;
        this.month = month;
        primeDate = LocalDate.of(year, month, day);
    }

    void dayOfWeek() {
        System.out.println("Day of week:" + primeDate.getDayOfWeek());

    }

    void countTimeInYear(int years) {
        value = 0;
        for (LocalDate newDate = primeDate; newDate.isBefore(primeDate.plusYears(years)); newDate = newDate.plusDays(1)) {
            if(newDate==primeDate){
                value++;
            }
            if (newDate.getDayOfWeek() == DayOfWeek.SUNDAY || newDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                value++;
            }

        }
        System.out.println("Within " + years + " years, the film was shown " + value + " times.");
    }


    void ConvertSectorDay(int years) {
        value = 0;
        for (LocalDate newDate = primeDate; newDate.isBefore(primeDate.plusYears(years)); newDate = newDate.plusDays(1)) {
            if (newDate.getDayOfWeek() == DayOfWeek.SUNDAY || newDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                value++;
            }
        }
            int value1 = value * 7200;
            int day = value1 / (24 * 3600);
            value1 = value1 % (24 * 3600);
            int hour = value1 / 3600;

            value1 %= 3600;
            int minutes = value1 / 60;

            value1 %= 60;
            int seconds = value1;

            System.out.println("Days:" + day + " hours:" + hour + " minutes:" + minutes);


        }


    void countTimeInYearBonus(int years) {
        value = 0;
        for (LocalDate newDate = primeDate; newDate.isBefore(primeDate.plusYears(years)); newDate = newDate.plusDays(1)) {
            if(newDate==primeDate){
                value++;
            }
            if (newDate.getDayOfWeek() == DayOfWeek.SUNDAY || newDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                if ((newDate.getMonth() == Month.JANUARY && newDate.getDayOfMonth() == 1) || (newDate.getMonth() == Month.FEBRUARY && newDate.getDayOfMonth() == 29)) {
                } else {
                    value++;
                }

            }
        }
        System.out.println("Within " + years + " years, the film was shown " + value + " times.");
    }
}


