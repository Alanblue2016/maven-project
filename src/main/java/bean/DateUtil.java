package bean;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 时间工具
 *
 * @author admin
 */
public class DateUtil {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    /**
     * 将普通时间格式转换为  微信要求使用的 rfc3339标准格式
     *
     * @param time 标准时间
     * @return
     * @throws ParseException
     */
    public static String convertDate(String time) throws ParseException {
        if (time != null) {
            //注意月份是MM
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(time);
            DateTime dt1 = new DateTime(date, DateTimeZone.forTimeZone(TimeZone.getTimeZone("Asia/Shanghai")));
            return dt1.toString();
        }
        return null;
    }

    /**
     * 将字符串格式时间转为Date yyyy-MM-dd HH:mm:ss
     *
     * @param time 传入时间字符串
     * @return
     * @throws ParseException
     */
    public static Date convertToDate(String time) throws ParseException {
        if (time != null) {
            //注意月份是MM
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(time);

            return date;
        }
        return null;
    }

    /**
     * 当前时间的  rfc3339标准格式
     *
     * @return
     */
    public static String getNowDateToString() {
        Date date = new Date();
        DateTime dt1 = new DateTime(date, DateTimeZone.forTimeZone(TimeZone.getTimeZone("Asia/Shanghai")));
        return dt1.toString();
    }

    /**
     * 获取rfc3339 格式 毫秒时间戳
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static Long getMillisecond(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        long millisecond = format.parse(date).getTime();

        return millisecond;
    }


    /**
     * 将rfc3339 格式转换为 普通格式 yyyy-MM-dd HH:mm:ss
     *
     * @param rfcDateStr
     * @return
     */
    public static String rfcToDateString(String rfcDateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTime dateTime = new DateTime(rfcDateStr);
        Long result = dateTime.toCalendar(Locale.getDefault()).getTimeInMillis();
        Date date = new Date(result);
        String dareString = simpleDateFormat.format(date);
        return dareString;
    }

    /**
     * 将rfc3339 格式转换为 毫秒时间戳
     *
     * @param rfcDateStr
     * @return
     */
    public static Long rfcToDateLong(String rfcDateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTime dateTime = new DateTime(rfcDateStr);
        Long result = dateTime.toCalendar(Locale.getDefault()).getTimeInMillis();

        return result;
    }

    /**
     * 将一个long类型的时间戳转换为rfc339格式的数据
     *
     * @param timeStamp 毫秒级时间戳
     * @return
     */
    public static String timeStampToRfc3339(long timeStamp) {
        DateTime dateTime = new DateTime(timeStamp, DateTimeZone.UTC);
        return dateTime.toString();
    }

}
