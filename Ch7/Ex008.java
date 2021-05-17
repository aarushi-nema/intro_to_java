package Ch7;

import java.util.Scanner;

/* Q: Write two overloaded methods that return the average of an array with the following headers:
      public static int average(int[] array)
      public static double average(double[] array)
      Write a test program that prompts the user to enter 10 double values, invokes this method, then displays the average value.

 */
public class Ex8 {

    final static int SIZE=10;

    public static int average (int [] array){
        int average=0;

        for(int i=0; i<array.length; i++){
            average+=array[i];
        }
        average/=(array.length);

        return average;
    }

    public static double average (double [] array){
        double average=0;

        for (int i=0; i<array.length; i++){
            average+=array[i];
        }
        average/=(array.length);

        return average;
    }

    public static void input (double [] array){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array: ");
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextDouble();
        }
    }

    public static void main (String [] args){
        double[] array= new double[SIZE];
        input(array);
        System.out.println("Average of elements= " + average(array));
    }

}
