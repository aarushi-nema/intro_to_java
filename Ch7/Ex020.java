package Ch7;

/*
    Q: The selection-sort method repeatedly finds the smallest number in the current array and swaps it with the first. 
       Rewrite this program by finding the largest number and swapping it with the last. 
       Write a test program that reads in 10 double numbers, invokes the method, and displays the sorted numbers.
 */

import java.util.Scanner;

public class Ex20 {

    //size of array
    final static int SIZE= 10;

    //method to sort array
    public static void reverseSelectionSort (double[] array){
        //index is the divider between sorted and unsorted array
        int index= array.length-1;
        for(int i=array.length-1; i>=0; i--){
            int large=i;
            for(int j=index; j>=0; j--){
                if(array[j]>array[large]){
                    large=j;
                }
            }

            //swap the largest number with the number at i
            if(large!=i){
                double temp= array[i];
                array[i]=array[large];
                array[large]= temp;
            }
            index--;
        }
    }

    //method to input array
    public static void inputArray(double[] array){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter " + SIZE + " elements of array: ");
        for(int i=0 ;i<array.length; i++){
            array[i]= sc.nextDouble();
        }
    }

    //method to display array
    public static void displayArray(double[] array){
        System.out.print("\nSorted array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ "  ");
        }

    }

    public static void main (String [] args){
        double[] array= new double[SIZE];
        inputArray(array);
        reverseSelectionSort(array);
        displayArray(array);
    }
}

/*
    Sample input/ output:

    Enter 10 elements of array: 7.8 2.1 4.9 0.9 7.1 10.6 11 41.7 90 13.6

    Sorted array: 0.9  2.1  4.9  7.1  7.8  10.6  11.0  13.6  41.7  90.0
 */
