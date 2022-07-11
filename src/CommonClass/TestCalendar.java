package CommonClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        // 计算2022-08-06所在的周是2022年的第几周
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2022);
        calendar.set(Calendar.MONTH,7);
        calendar.set(Calendar.DAY_OF_MONTH,6);
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(week);
        // 计算2022-08-06 50天之后的日期
        int day = calendar.get(Calendar.DAY_OF_YEAR)+50;
        System.out.println(day);
        calendar.set(Calendar.DAY_OF_YEAR,day);
        Date time = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(time));
    }
}
