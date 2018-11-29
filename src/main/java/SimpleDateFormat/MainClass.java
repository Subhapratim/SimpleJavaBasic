package SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainClass {

    public static void main(String[] args) {
        DateFormaterClass dateFormaterClass = new DateFormaterClass();
        Date date = new Date();
        System.out.println("Date : "+date);
        System.out.println();

        System.out.print("Date and Time(24 hr) : ");
        String format1 = "dd/MM/yyyy HH:mm";
        dateFormaterClass.dateFormater(format1, date);

        System.out.print("Date and Time(12 hr) : ");
        String format2 = "dd/MMM/yyyy hh:mm a";
        dateFormaterClass.dateFormater(format2, date);

        System.out.print("Date and Time(12 hr & mili seconds) : ");
        String format3 = "dd/MMMM/yyyy hh:mm:ss.SSSZ a";
        dateFormaterClass.dateFormater(format3, date);

        System.out.print("Era designator of Given : ");
        String format4 = "G";
        dateFormaterClass.dateFormater(format4, date);

        System.out.print("Day and Day of Week : ");
        String format5 = "EEEE F";
        dateFormaterClass.dateFormater(format5, date);

        System.out.print("Day in year : ");
        String format6 = "D";
        dateFormaterClass.dateFormater(format6, date);

        System.out.print("Week in year : ");
        String format7 = "w";
        dateFormaterClass.dateFormater(format7, date);

        System.out.print("Week in month : ");
        String format8 = "W";
        dateFormaterClass.dateFormater(format8, date);

        System.out.print("Hour in Day(24 hr) : ");
        String format9 = "k";
        dateFormaterClass.dateFormater(format9, date);

        System.out.print("Hour in Day(12 hr) : ");
        String format10 = "K";
        dateFormaterClass.dateFormater(format10, date);

        System.out.print("Year with Era : ");
        String format11 = "yyyy G";
        dateFormaterClass.dateFormater(format11, date);

        System.out.println();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        System.out.println("Date : "+sdf.format(date));

    }

}
