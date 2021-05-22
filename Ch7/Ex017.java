package Ch7;

/*
    Q: Write a program that prompts the user to enter the number of students, the students’ names, and their
    scores and prints student names in decreasing order of their scores.
    Assume the name is a string without spaces, use the Scanner’s next() method to read a name.
 */

import java.util.Scanner;

public class Ex17 {
  
    //method to sort the arrays. I've used selection sort
    public static void sortStudents (int[] studentScores, String[] studentNames){
        //variable to indicate the 
        int index=0;
        for(int i=0; i<studentScores.length; i++){
            int small= i;
            for(int j=index; j<studentScores.length; j++){
                if(studentScores[j]<studentScores[small]){
                    small=j;
                }
            }
            if(small!=i){
                int temp=studentScores[i];
                studentScores[i]= studentScores[small];
                studentScores[small]=temp;

                String tempName=studentNames[i];
                studentNames[i]= studentNames[small];
                studentNames[small]=tempName;

            }
            index++;
        }
    }

    public static void inputArray(int[] studentScores, String[] studentNames){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter names and scores of students: ");
        for(int i=0; i<studentScores.length; i++){
            studentNames[i]= sc.next();
            studentScores[i]= sc.nextInt();
        }
    }

    public static void displayArray (int[] studentScores, String[] studentNames){
        for(int i=0; i<studentScores.length; i++){
            System.out.println("Score of " + studentNames[i] + " is " + studentScores[i]);
        }
    }

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int size= sc.nextInt();

        int[] studentScores= new int[size];
        String[] studentNames= new String[size];

        inputArray(studentScores, studentNames);
        sortStudents(studentScores, studentNames);
        displayArray(studentScores, studentNames);
    }
}

/*
    Sample input and output
    
    Enter number of students: 
    5
    Enter names and scores of students: 
    s1 99
    s2 80
    s3 100
    s4 60
    s5 95
    Score of s4 is 60
    Score of s2 is 80
    Score of s5 is 95
    Score of s1 is 99
    Score of s3 is 100
 */
