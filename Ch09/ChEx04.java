package Ch9;

import java.util.Date;

/**
 *  Question: USe the java.util.Date class to get the time elapsed since January 1 !970 in milliseconds, seconds,
 *  minutes, and hours. Find the current date and time.
 *  Created by aarushi on 10/6/21.
 */
public class ChEx04 {

    final static int TIMEZONEHOURS= 5;
    final static int TIMEZONEMINUTES=30;
    final static String TIMEZONE="IST";

    public static void main(String[] args){
        Date date= new Date();

        long totalMilliseconds= date.getTime();
        System.out.println("Time lapsed since January 1 1970 in milliseconds: " + totalMilliseconds);

        long totalSeconds= totalMilliseconds/1000;
        System.out.println("Time lapsed since January 1 1970 in seconds: " + totalSeconds);

        long totalMinutes= totalSeconds/60;
        System.out.println("Time lapsed since January 1 1970 in minutes: " + totalMinutes);

        long totalHours= totalMinutes/60;
        System.out.println("Time lapsed since January 1 1970 in hours: " + totalHours);

        long currentTimeHours= totalHours%24;
        long currentTimeMinutes= totalMinutes%60;
        System.out.println("Current Time: " + (currentTimeHours+TIMEZONEHOURS) + " hours " + (currentTimeMinutes+TIMEZONEMINUTES) + " minutes " + TIMEZONE);

        System.out.println("Current date and time: " + date.toString());
    }
}

/*
    Sample Output

    Time lapsed since January 1 1970 in milliseconds: 1623309680976
    Time lapsed since January 1 1970 in seconds: 1623309680
    Time lapsed since January 1 1970 in minutes: 27055161
    Time lapsed since January 1 1970 in hours: 450919
    Current Time: 12 hours 51 minutes IST
    Current date and time: Thu Jun 10 12:51:20 IST 2021
 */
