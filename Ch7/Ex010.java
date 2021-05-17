package Ch7;

/*
    Q: Write a method that returns the index of the smallest element in an array of integers. If the number of such
       elements is greater than 1, return the smallest index. Use the following header:
       public static int indexOfSmallestElement(double[] array)
       Write a test program that prompts the user to enter 10 numbers, invokes this
       method to return the index of the smallest element, and displays the index.
 */

import java.util.Scanner;

public class Ex10 {

    final static int SIZE= 10;

    public static int indexOfSmallestElement (double[] array){
        int smallestIndex=0;
        for(int i=0; i<array.length; i++){
            if(array[i]<array[smallestIndex]){
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }

    public static void input (double[] array){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i< array.length; i++){
            array[i]= sc.nextDouble();
        }
    }

    public static void main (String [] args){
        double[] array= new double[SIZE];
        input(array);
        System.out.println("Index of smallest element is " + indexOfSmallestElement(array));
    }
}
