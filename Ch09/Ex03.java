package Ch9;

import java.util.Date;

/**
 * Q: Write a program that creates a Date object, sets its
 elapsed time to 10000 , 100000 , 1000000 , 10000000 , 100000000 ,
 1000000000 , 10000000000 , and 100000000000 , and displays the date and
 time using the toString() method, respectively.

 * Created by aarushi on 16/6/21.
 */
public class Ex03 {
    public static void main(String [] args){
        Date date= new Date();
        for(long i=10000; i<=1e11; i*=10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}

/*
    Sample Output:

    Thu Jan 01 05:30:10 IST 1970
    Thu Jan 01 05:31:40 IST 1970
    Thu Jan 01 05:46:40 IST 1970
    Thu Jan 01 08:16:40 IST 1970
    Fri Jan 02 09:16:40 IST 1970
    Mon Jan 12 19:16:40 IST 1970
    Sun Apr 26 23:16:40 IST 1970
    Sat Mar 03 15:16:40 IST 1973

 */
