package Ch7;

/*
    Q: Write a program that prompts the user to enter 10 integers and displays all combinations of picking two numbers
       from the 10 numbers.
 */

/*
    Step 1: Create array
    Step 2: Prompt user to input arrays
    Step 3: Run a double loop pairing each element with other elements
 */

import java.util.Scanner;

public class Ex28 {

    final static int SIZE= 10;

    public static void main(String[] args) {
        //Step 1: Create array
        int[] array= new int[SIZE];
        //Step 2: Prompt user to input arrays
        inputArrays(array);
        //Step 3: Run a double loop pairing each element with other elements
        pairContents(array);
    }

    public static void inputArrays(int[] array){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter contents of array: ");
        for(int i=0; i<array.length; i++){
            array[i]= sc.nextInt();
        }
    }

    public static void pairContents(int[] array){
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if(i!=j){
                    System.out.print(array[i]+ "" + array[j]+ " ");
                }
            }
        }
    }
}

/* 
    Sample Input/Output
    
    Enter contents of array: 
    0 1 2 3 4 5 6 7 8 9
    01 02 03 04 05 06 07 08 09 10 12 13 14 15 16 17 18 19 20 21 23 24 25 26 27 28 29 30 31 32 34 35 36 37 38 39 40 41 42 43 45 46 47 48 49 50 51 52 53 54 56 57 58 59 60 61 62 63 64 65 67 68 69 70 71 72 73 74 75 76 78 79 80 81 82 83 84 85 86 87 89 90 91 92 93 94 95 96 97 98 

 */
