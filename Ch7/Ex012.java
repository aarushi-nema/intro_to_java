package Ch7;

/*
    Q: Write a program to reverse the elements in an integer array without copying it into a new array. 
       Write a test program that prompts the user to enter 10 numbers, invokes the method to reverse
       the numbers, and displays the numbers.
 */
import java.util.Scanner;

public class Ex12 {

    final static int SIZE=10;

    public static int[] reverse (int [] array){
        for (int i=0; i<array.length/2; i++){
            int temp= array[i];
            array[i]= array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        return array;
    }

    public static void input(int[] array){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 elements of array: ");
        for (int i=0; i<array.length; i++){
            array[i]= sc.nextInt();
        }
    }

    public static void display (int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main (String [] args){
        int[] array= new int[SIZE];
        input(array);
        reverse(array);
        display(array);
    }
}
