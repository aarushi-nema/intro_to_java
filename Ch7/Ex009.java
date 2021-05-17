package Ch7;

/*
    Q: Write a method that finds the smallest element in an array of double values using the following header:
       public static double min(double[] array)
       Write a test program that prompts the user to enter 10 numbers,
       invokes this method to return the minimum value, and displays the minimum value.
 */

import java.util.Scanner;

public class Ex9 {

    final static int SIZE= 10;

    public static double min (double[] array){
        double minElement= array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]<minElement){
                minElement=array[i];
            }
        }

        return minElement;
    }

    public static void input (double[] array){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 elements of the array: ");
        for(int i=0; i<array.length; i++){
            array[i]= sc.nextDouble();
        }
    }

    public static void main (String [] args){
        double[] array= new double[SIZE];
        input(array);
        System.out.println("The smallest element is " + min(array));
    }
}
