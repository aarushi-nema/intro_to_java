package Ch7;

/*
    Q: Write a method that returns a new array by eliminating the duplicate values
       in the array using the following method header:
       public static int[] eliminateDuplicates(int[] list)
       Write a test program that reads in 10 integers, invokes the method, and displays
       the distinct numbers separated by exactly one space.
 */

import java.util.Scanner;

public class Ex15 {

    //length of the input array
    final static int SIZE=10;
    //length of the new array containing all unique elements
    static int uniqueElementSize=0;

    public static int[] eliminateDuplicates (int[] list){
        //array that will contain the unique elements
        int [] uniqueElements= new int[list.length];
        
        for(int i=0; i<list.length; i++){
            boolean b= isUnique(uniqueElements, list[i], i);
            //if element does not belong to uniqueElements array then add it to the uniqueElements array
            if(b){
                uniqueElements[uniqueElementSize++]=list[i];
            }
        }
        return uniqueElements;
    }
    
    //function that checks whether the element is unique
    public static boolean isUnique (int[] uniqueElements, int element, int length){
        boolean b;
        for(int i=0; i<=length; i++){
            //if element already exists in unique elements then return false
            if(element==uniqueElements[i]){
                return false;
            }
        }
        return true;
    }

    public static void inputArray (int[] list){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter " + SIZE + " elements of array: ");
        for(int i=0; i<SIZE; i++){
            list[i]= sc.nextInt();
        }
    }

    public static void displayArray (int[] array){
        for(int i=0; i<uniqueElementSize; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main (String [] args){
        int[] list= new int[SIZE];
        inputArray(list);
        displayArray(eliminateDuplicates(list));
    }
}
