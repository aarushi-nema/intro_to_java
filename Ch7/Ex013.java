package Ch7;

/*
    Q: Write a method that returns a random number between 1 and 54, excluding the numbers passed in the argument.
       The method header is specified as follows:
       public static int getRandom(int... numbers)
 */

import java.util.Scanner;

public class Ex13 {

    static int size;

    public static int getRandom(int... numbers){
        //variable that checks whether the random number generated belongs to the array
        boolean belongs=false;
        //variable that stores the random number generated
        int randomNum;

        do{
            belongs=false;
            //generate the random number
            randomNum= (int)(Math.random()*54);
            for(int i=0; i<size; i++){
                //check whether it belongs to the aray
                if(numbers[i]==randomNum){
                    belongs=true;
                }
            }
        }while(belongs);
        return randomNum;
    }

    public static void main (String [] args){
        System.out.println("Random Number: " + getRandom( 1,2,3,4,5,6,7,8,9));
    }
}
