package Ch7;

/*
    Q: The arrays list1 and list2 are identical if they have the same contents.
       Write a method that returns true if list1 and list2 are identical, using the following header:
        public static boolean equals(int[] list1, int[] list2)
       Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical.
*/

/*
    Step 1: create two arrays
    Step 2: prompt user to enter values of arrays
    Step 3: sort the arrays
    Step 4: check whether they have same content
    Step 5: display result
 */

import java.util.Scanner;

public class Ex27 {

    final static int SIZE=6;

    public static void main(String[] args) {
        //Step 1: create two arrays
        int[] list1= new int[SIZE];
        int[] list2= new int[SIZE];

        //Step 2: prompt user to enter values of arrays
        inputArrays(list1, list2);

        //Step 3: sort the arrays
        selectionSort(list1);
        selectionSort(list2);

        //Step 4: check whether they have same content
        //Step 5: display result
        displayResult(equals(list1, list2));
    }

    public static void inputArrays(int[] list1, int[] list2){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter contents of array 1: ");
        for(int i=0; i<list1.length; i++){
            list1[i]= sc.nextInt();
        }
        System.out.println("Enter contents of array 2: ");
        for(int i=0; i<list2.length; i++){
            list2[i]= sc.nextInt();
        }
    }

    public static void selectionSort(int[] array){
        int index=0;
        for(int i=0; i<array.length; i++){
            int small= i;
            for(int j=index; j<array.length; j++){
                if(array[j]<array[small]){
                    small=j;
                }
            }
            if(small!=i){
                int temp= array[i];
                array[i]= array[small];
                array[small]= temp;
            }
            index++;
        }
    }

    public static boolean equals(int[] list1, int[] list2){
        if(list1.length!=list2.length){
            return false;
        }
        for(int i=0; i<list1.length; i++){
            if(list1[i]!=list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void displayResult (boolean isIdentical){
        if(isIdentical){
            System.out.println("The arrays are identical");
        } else {
            System.out.println("The arrays are not identical");
        }
    }
}

/*
    Sample Input/ Output

    Enter contents of array 1:
    5 2 5 6 6 1
    Enter contents of array 2:
    5 5 2 6 1 6
    The arrays are identical

 */
