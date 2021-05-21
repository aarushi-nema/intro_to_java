package Ch7;

/*
    Q: Write a sort method that uses the bubble-sort algorithm.
    The bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared.
     If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. The technique is called a
     bubble sort or sinking sort because the smaller values gradually “bubble” their way to the top, and the larger values
     “sink” to the bottom.
     Write a test program that reads in 10 double numbers, invokes the method, and displays the sorted numbers.
 */

import java.util.Scanner;

public class Ex18 {

    final static int SIZE=10;

    public static void bubbleSort (int [] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1; j++){
                //compare successive elements and swap if the values are not in order
                if(array[j+1]<array[j]){
                    int temp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }

    //method to input array
    public static void inputArray(int[] array){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter " + SIZE + " elements of array: ");
        for(int i=0; i<array.length; i++){
            array[i]= sc.nextInt();
        }
    }

    //method to display array
    public static void displayArray (int[] array){
        System.out.println("Array sorted by Bubble sort: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

    public static void main (String [] args){
        int[] array= new int[SIZE];
        inputArray(array);
        bubbleSort(array);
        displayArray(array);
    }
}

/*
  Sample input and output
  
  Enter 10 elements of array: 
  22 54 88 12 10 1 67 84 90 100
  Array sorted by Bubble sort: 
  1 10 12 22 54 67 84 88 90 100 
  
*/
