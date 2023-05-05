package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @className:DateUtils
 * @author：jirumutu
 * @date:2019/7/24
 * @description:TODO
 */
public class DateUtils {

    public static final DateFormat SQL99_MILLISECOND_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");//毫秒
    public static final DateFormat SQL99_SECOND_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//秒


    /**
      * @author:jirumutu
      * @date:2019/7/25
      * @param:[date, dimensionType]
      * @return:java.lang.String
      * @description:日期格式转换为string类型
    */
    public static String date2String(Date date, String dimensionType) {
        SimpleDateFormat formatter = new SimpleDateFormat(dimensionType);
        String formatDate = formatter.format(date);
        if (dimensionType.equals("SQL99_MILLISECOND_FORMAT")) {
            formatDate = SQL99_MILLISECOND_FORMAT.format(date);
        }
        if (dimensionType.equals("SQL99_SECOND_FORMAT")) {
            formatDate = SQL99_SECOND_FORMAT.format(date);
        }
        return formatDate;
    }

    /**
      * @author:jirumutu
      * @date:2019/7/24
      * @param:[]
      * @return:java.lang.String
      * @description:获取当前日期,返回数据格式:yyyyMMddHHmmss
    */
    public static String getNowYmdHms() {
        return date2String(new Date(),"yyyyMMddHHmmss");
    }


    /**
     * 随机生成年月日
     * @return
     */
    public static Long getRandomID() {

        String str = getNowYmdHms();
        int random = (int) Math.random() * (99999 - 10000 + 1) + 10000;

        return Long.valueOf(str + random);
    }


    /**
     * 时间戳转换为日期
     * @param date
     * @param dimensionType
     * @return
     */
    public static String dateLong2String(Long date, String dimensionType) {
        SimpleDateFormat formatter = new SimpleDateFormat(dimensionType);
        String formatDate = formatter.format(new Date(date));
        if (dimensionType.equals("SQL99_MILLISECOND_FORMAT")) {
            formatDate = SQL99_MILLISECOND_FORMAT.format(date);
        }
        if (dimensionType.equals("SQL99_SECOND_FORMAT")) {
            formatDate = SQL99_SECOND_FORMAT.format(date);
        }
        return formatDate;
    }


    /**
     * 生成某两个日期之间的日期
     * @param beginDate
     * @param endDate
     * @return
     */
    public static Date randomDate(String beginDate, String endDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);//构造开始日期
            Date end = format.parse(endDate);//构造结束日期
            //getTime()表示返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = random(start.getTime(), end.getTime());
            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static long random(long begin, long end) {
        long rtn = begin + (long) (Math.random() * (end - begin));
        //如果返回的是开始时间和结束时间，则递归调用本函数查找随机值
        if (rtn == begin || rtn == end) {
            return random(begin, end);
        }
        return rtn;
    }

    /**
     * 计算两个日期之间相差的天数
     *
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

}

