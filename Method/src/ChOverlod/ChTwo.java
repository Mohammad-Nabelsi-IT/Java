package ChOverlod;

public class ChTwo {
    public static void main(String[] args) {
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(65, 100));
    }//main

    public static String getDurationString(int second) {
        // 5400 / 60 minute
        if (second >= 0) {
            int minute = second / 60;
            int remainingSecond = second % 60;
            return getDurationString(minute, remainingSecond);
        } else {
            return "Please Enter Second Greater than or Zero";
        }
    }

    public static String getDurationString(int minute, int second) {
        if (minute >= 0 && (second >= 0 && second <= 59)) {
            int hour = minute / 60;
            int remainingMinute = minute % 60;

            return hour + "h " + remainingMinute + "m " + second + "s";
        } else {
            return "Please Enter Minute Greater than or Zero\n and Second Greater than or Zero and Less Than or Equal 59";
        }
    }


}//class
