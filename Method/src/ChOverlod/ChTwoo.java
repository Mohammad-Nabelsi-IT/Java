package ChOverlod;

public class ChTwoo {
    public static void main(String[] args) {
        System.out.println(getDurationString(5400));  // This is the first test case
        System.out.println(getDurationString(65, 45));  // This is the second test case
    }


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

    public static String getDurationStringOld(int second) {
        // 5400 / 60 minute
        int minute = second / 60;
        int hour = minute / 60;
        int remainingSecond = second % 60;
        int remainingMinute = minute % 60;
        return hour + " h " + remainingMinute + " m " + remainingSecond + " s";
    }

    public static String getDurationStringOld(int minute, int second) {
        int hour = minute / 60;
        int remainingMinute = minute % 60;
        return hour + " h " + remainingMinute + " m " + second + " s";
    }


}
