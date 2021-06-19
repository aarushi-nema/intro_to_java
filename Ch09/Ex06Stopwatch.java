package Ch9;

import java.util.Date;

/**
 * Q: Design a class named StopWatch . The class contains:
     o Private data fields startTime and endTime with getter methods.
     o A no-arg constructor that initializes startTime with the current time.
     o A method named start() that resets the startTime to the current
     time.
     o A method named stop() that sets the endTime to the current time.
     o A method named getElapsedTime() that returns the elapsed time for
     the stopwatch in milliseconds.
     Write a test program that measures the execution time of sorting 100,000 numbers using
     selection sort.

 * Created by aarushi on 17/6/21.
 */
public class Ex06Stopwatch {

    private long startTime;
    private long endTime;

    public Ex06Stopwatch(){
        startTime= new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime= new Date().getTime();
    }

    public void stop(){
        endTime= new Date().getTime();
    }

    public long getElapsedTime(){
        return (endTime-startTime);
    }
}

