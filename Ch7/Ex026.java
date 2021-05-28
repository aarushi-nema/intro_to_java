package Ch7;

/*
    Q: The arrays list1 and list2 are strictly identical if their corresponding elements are equal.
       Write a method that returns true if list1 and list2 are strictly identical, using the following header:
        public static boolean equals(int[] list1, int[] list2)
       Write a test program that prompts the user to enter two lists of integers and displays whether the two are
       strictly identical.
 */

/*
    Step 1: Create the two integer arrays
    Step 2: Prompt user to enter values of two arrays
    Step 3: Check if they are equal
    Step 4: Return boolean result
 */

import java.util.Scanner;

public class Ex26 {

    final static int SIZE= 10;

    public static void main(String[] args) {
        //Step 1: Create the two integer arrays
        int[] list1= new int[SIZE];
        int[] list2= new int[SIZE];

        //Step 2: Prompt user to enter values of two arrays
        inputArrays(list1, list2);
        //Step 3: Check if they are equal
        //Step 4: Return boolean result
        displayResult(isStrictlyEqual(list1, list2));
    }

    public static void inputArrays(int[] list1, int[] list2){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter " + SIZE + " elements of array 1: ");
        for(int i=0; i<list1.length; i++){
            list1[i]= sc.nextInt();
        }
        System.out.println("Enter " + SIZE + " elements of array 2: ");
        for(int i=0; i<list2.length; i++){
            list2[i]= sc.nextInt();
        }
    }

    public static boolean isStrictlyEqual (int[] list1, int[] list2){
        for(int i=0; i<list1.length; i++){
            if(list1[i]!=list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void displayResult(boolean isSame){
        if(isSame){
            System.out.println("The two lists are strictly equal");
        } else {
            System.out.println("The two lists are not equal");
        }
    }

}

/*
    Sample input/output

    Enter 10 elements of array 1:
    1 1 2 3 5 6 8 9 1 3
    Enter 10 elements of array 2:
    1 1 2 3 5 6 8 9 1 3
    The two lists are strictly equal
 */
