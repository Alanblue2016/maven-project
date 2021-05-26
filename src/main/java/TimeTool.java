import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TimeTool {

    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
    public static final DateTimeFormatter wxformatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    public static final DateTimeFormatter stringFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    static DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


    public static String dateToString(LocalDateTime dateTime) {
        return dateTime.format(stringFormatter);
    }

    public static Instant strToInstant(String str, DateTimeFormatter formatter) {
        return LocalDateTime.from(formatter.parse(str)).atZone(ZoneId.systemDefault()).toInstant();
    }

    public static String getInstantStr(Instant time) {
        if (time == null) {
            return null;
        }
        LocalDateTime localDateTime = LocalDateTime.ofInstant(time, ZoneId.systemDefault());
        return stringFormatter.format(localDateTime);
    }

    public static Instant strToInstant(String str) {
        return LocalDateTime.from(stringFormatter.parse(str)).atZone(ZoneId.systemDefault()).toInstant();
    }


    public static Integer findDates(String stime, String etime) throws ParseException {
        List<String> allDates = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date dBegin = sdf.parse(stime);
        Date dEnd = sdf.parse(etime);
        allDates.add(sdf.format(dBegin));
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            allDates.add(sdf.format(calBegin.getTime()));
        }
        if (allDates == null) {
            return 0;
        }
        return allDates.size();
    }

    public static String formatInstant(Instant instant, DateTimeFormatter formatter) {
        if (formatter == null) {
            formatter = defaultFormatter;
        }
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return formatter.format(localDateTime);
    }


    /**
     *  获取毫秒时间戳
     * @param date
     * @return
     * @throws ParseException
     */
    public static Long getMillisecond(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        long millisecond = format.parse(date).getTime();

        return millisecond;
    }
}
