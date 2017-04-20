package com.geely.dilan.timetaskhelp;


public class TimeUtils {

    /**
     * 获取小时分钟秒
     *
     * @param milliseconds
     * @return
     */
    public static String getHourMinuteSecond(long milliseconds) {
        long hour = milliseconds / (60 * 60 * 1000);
        String h = hour == 0 ? "00" : (hour < 10 ? "0" + hour : hour + "");
        long minute = (milliseconds - hour * 60 * 60 * 1000) / (60 * 1000);
        String m = minute == 0 ? "00" : (minute < 10 ? "0" + minute : minute
                + "");
        long second = (milliseconds - hour * 60 * 60 * 1000 - minute * 60 * 1000) / 1000;
        String s = second == 0 ? "00" : (second < 10 ? "0" + second : second
                + "");
        return h + ":" + m + ":" + s;
    }

    /**
     * 获取分钟秒
     *
     * @param milliseconds
     * @return
     */
    public static String getMinuteSecond(long milliseconds) {
        long hour = milliseconds / (60 * 60 * 1000);
        long minute = (milliseconds - hour * 60 * 60 * 1000) / (60 * 1000);
        String m = minute == 0 ? "00" : (minute < 10 ? "0" + minute : minute
                + "");
        long second = (milliseconds - hour * 60 * 60 * 1000 - minute * 60 * 1000) / 1000;
        String s = second == 0 ? "00" : (second < 10 ? "0" + second : second
                + "");
        return m + ":" + s;
    }

    /**
     * 验证码获取秒0-60
     *
     * @param milliseconds
     * @return
     */
    public static String getSecond(long milliseconds) {
        long hour = milliseconds / (60 * 60 * 1000);
        long minute = (milliseconds - hour * 60 * 60 * 1000) / (60 * 1000);
        String m = minute == 0 ? "00" : (minute < 10 ? "0" + minute : minute
                + "");
        long second = (milliseconds - hour * 60 * 60 * 1000 - minute * 60 * 1000) / 1000;
        String s = second + "";
        return s;
    }
}
