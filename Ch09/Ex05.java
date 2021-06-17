package Ch9;

import java.util.GregorianCalendar;

/**
 * Q: Java API has the GregorianCalendar class in the java.util package, which you can use to
     obtain the year, month, and day of a date. The no-arg constructor constructs
     an instance for the current date, and the methods
     get(GregorianCalendar.YEAR) , get(GregorianCalendar.MONTH) , and
     get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
     Write a program to perform two tasks:
     1. Display the current year, month, and day.
     2. The GregorianCalendar class has the setTimeInMillis(long) , which
     can be used to set a specified elapsed time since January 1, 1970. Set
     the value to 1234567898765L and display the year, month, and day.
 *
 * Created by aarushi on 16/6/21.
 */
public class Ex05 {
    public static void main(String [] args){
        GregorianCalendar calendar= new GregorianCalendar();
        System.out.print("Current year, month, and day in format dd/mm/yyyy: ");
        System.out.println(calendar.get(calendar.DAY_OF_MONTH)+ "/" + calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.YEAR));

        System.out.print("Elapsed time since January 1, 1970 set to 1234567898765L in format dd/mm/yyyy: ");
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(calendar.DAY_OF_MONTH)+ "/" + calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.YEAR));

    }
}

/*
    Output
    Current year, month, and day in format dd/mm/yyyy: 17/5/2021
    Elapsed time since January 1, 1970 set to 1234567898765L in format dd/mm/yyyy: 14/1/2009


 */