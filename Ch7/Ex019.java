package Ch7;

/*
    Q: Write the following method that returns true if the list is already sorted in non decreasing order:
        public static boolean isSorted(int[] list)
       Write a test program that prompts the user to enter a list and displays whether the list is sorted or not.
       The program should first prompt the user to enter the size of the list.
 */

import java.util.Scanner;

public class Ex19 {

    //method to check if list is sorted
    public static boolean checkSorted (int[] list){
        //create a copy that will store the sorted list
        int[] listCopy= new int[list.length];
        //copy contents of list to listCopy
        for(int i=0; i<list.length; i++){
            listCopy[i]= list[i];
        }

        //sort listCopy
        listCopy= sortList(listCopy);

        //check if both lists, list and the sorted listCopy are same. If not, return false
        for(int i=0; i<list.length; i++){
            if(listCopy[i]!=list[i]){
                return false;
            }
        }

        //return true if the list if sorted
        return true;
    }

    //method to sort listCopy (selection sort)
    public static int[] sortList (int[] list){
        int index=0;
        for(int i=0 ;i<list.length; i++){
            int small=i;
            for(int j=index; j<list.length; j++){
                if(list[j]<list[index]){
                    small=j;
                }
            }

            if(small!=i){
                int temp= list[i];
                list[i]= list[small];
                list[small]= temp;
            }
            index++;
        }
        return list;
    }

    //method to input list
    public static void inputList(int[] list){
        Scanner sc= new Scanner(System.in);
        System.out.print("\nEnter contents of list: ");
        for(int i=0; i<list.length; i++){
            list[i]= sc.nextInt();
        }
    }

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size of list: ");
        int size= sc.nextInt();

        int[] list= new int[size];
        inputList(list);
        boolean isSorted= checkSorted(list);

        if(isSorted){
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");

        }
    }
}

/*
    Sample input/ output:

    Run 1:

    Enter Size of list: 5

    Enter contents of list: 4 2 6 1 2
    The list is not sorted

    ________

    Run 2
    
    Enter Size of list: 5

    Enter contents of list: 1 2 3 4 5 
    The list is sorted
    
 */
