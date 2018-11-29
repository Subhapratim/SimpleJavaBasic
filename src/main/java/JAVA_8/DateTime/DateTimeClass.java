package JAVA_8.DateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTimeClass {
    public void dateTimeMethod(){

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate today = currentTime.toLocalDate();
        System.out.println("date1: " + today);

        int year = currentTime.getYear();
        Month month = currentTime.getMonth();
        int date = currentTime.getDayOfMonth();
        DayOfWeek day = currentTime.getDayOfWeek();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int seconds = currentTime.getSecond();
        System.out.println(day+" "+date+"/"+month+"/"+year+"-"+hour+":"+minute+":"+seconds);
        System.out.println("\n");



        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        //add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        //add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);
        System.out.println("\n");




        //get the next tuesday
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(today.getYear(),today.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
                DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
        System.out.println("\n");



        //Get the current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);
        //Get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Zone Id: " + currentZone);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date: " + localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("Zoned date: " + zonedDateTime);
        System.out.println("\n");

    }
}
