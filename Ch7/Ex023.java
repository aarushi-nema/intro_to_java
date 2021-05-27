package Ch7;

/*
    Q: A school has 100 lockers and 100 students. All lockers are closed on the first day of school. As the students
       enter, the first student, denoted as S1, opens every locker. Then the second student, S2, begins with the second locker,
       denoted as L2, and closes every other locker. Student S3 begins with the third locker and changes every third locker
       (closes it if it was open and opens it if it was closed). Student S4 begins with locker L4 and changes every fourth
       locker. Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.
       After all the students have passed through the building and changed the lockers, which lockers are open?

       Write a program to find your answer and display all open locker numbers separated by exactly one space.
       (Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open (true) or closed (false).
       Initially, all lockers are closed.)
 */

public class Ex23 {

    //Number of lockers
    final static int SIZE=100;

    public static void main (String[] args){
        //array that stores whether a locker is open or close
        //false- close
        //true- open
        boolean[] lockerState=  new boolean[SIZE];
        //variable to store which student is changing the locker state
        int studentNumber=0;
        //initially close all lockers
        closeLockers(lockerState);
        //depending on student number change the locker state
        for(int i=studentNumber; i<SIZE; i++){
            changeLockerState(lockerState, studentNumber);
            studentNumber++;
        }
    }

    //method to close all lockers
    public static void closeLockers (boolean[] lockerState){
        for (int i=0; i<lockerState.length; i++){
            lockerState[i]=false;
        }
    }

    //method to change locker state depending upon the student number
    public static void changeLockerState (boolean[] lockerState, int studentNumber){
        for(int i=studentNumber; i<lockerState.length; i+=(studentNumber+1)){
            lockerState[i]=!lockerState[i];
        }
    }
}
