package SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormaterClass {

    public void dateFormater(String format, Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String newDate = simpleDateFormat.format(date);
        System.out.println(newDate);
    }

}
