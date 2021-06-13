package Ch9;

import java.util.Random;

/**
 * Q: Write a program that generates the same sequence of random int values. Use the java.util.Random class.
 *
 * Created by aarushi on 13/6/21.
 */
public class ChEx05 {
    public static void main (String[] args){
        Random object1= new Random(5);
        System.out.println("Series 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(object1.nextInt(100)+ " ");
        }

        Random object2= new Random(5);
        System.out.println("\nSeries 2");
        for (int i = 0; i < 10; i++) {
            System.out.print(object2.nextInt(100)+ " ");
        }
    }

}

/*
  Output

  Series 1:
  87 92 74 24 6 5 54 91 22 21 
  Series 2
  87 92 74 24 6 5 54 91 22 2
*/
