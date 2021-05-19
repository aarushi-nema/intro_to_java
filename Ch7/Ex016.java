package Ch7;

/*
    Q: Write a program that randomly generates an array of 100,000 integers and a key.
       Estimate the execution time of invoking the linearSearch method.
       Sort the array and estimate the execution time of invoking the binarySearch method.
       You can use the following code template to obtain the execution time:
        long startTime = System.nanoTime(); perform the task;
        long endTime = System.nanoTime();
        long executionTime = endTime − startTime;
 */

import java.util.Arrays;

public class Ex16 {

    final static int SIZE= 100000;

    //method for linear search
    public static long linearSearch(int[] array, int key){
        boolean found=false;

        //get the start time
        long startTime= System.nanoTime();
        for(int i=0; i<array.length; i++){
            if(key==array[i]){
                found=true;
            }
        }
        //get the end time
        long endTime= System.nanoTime();

        //return the difference between the end and start time
        return endTime-startTime;
    }

    //method for binary search
    public static long binarySearch(int[] array, int key){
        boolean found=false;
        //binary search requires a sorted array
        Arrays.sort(array);
        int lowBound= 0, upBound= array.length-1;

        //get the start time
        long startTime= System.nanoTime();
        while(upBound>lowBound){
            int mid=(upBound+lowBound)/2;
            if(key<array[mid]){
                upBound=mid-1;
            } else if (key>array[mid]){
                lowBound=mid+1;
            } else {
                found=true;
                break;
            }
        }
        //get the end time
        long endTime= System.nanoTime();

        //return the difference between the end and start time
        return endTime-startTime;
    }

    //method to generate random numbers
    public static void generateArray(int[] array){
        for(int i=0; i<SIZE; i++){
            array[i]=(int)(Math.random()*100);
        }
    }

    public static void main (String [] args){
        int[] array= new int[SIZE];
        generateArray(array);
        //generate a random key
        int key= (int)(Math.random()*100);
        System.out.println("Time taken in linear search: " + linearSearch(array, key) + " nanoseconds");
        System.out.println("Time taken in binary search: " + binarySearch(array, key) + " nanoseconds");
    }
}
