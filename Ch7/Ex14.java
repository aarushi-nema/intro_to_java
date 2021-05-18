package Ch7;

/*
    Q: Write a method that returns the gcd of an unspecified number of integers. The method header is specified as follows:
       public static int gcd(int... numbers)
       Write a test program that prompts the user to enter five numbers, invokes the method to find the gcd of these numbers,
       and displays the gcd.

       How to find GCD:
       1. Divide the larger number by the smaller number. If number is zero then divisor is GCD
       2. Let the divisor of step 1 be the dividend now and make the remainder as the new divisor. Continue the process
          till you get a zero as remainder
       3. Last divisor will be GCD
 */

import java.util.Arrays;

public class Ex14 {

    public static int gcd (int... numbers){
        //sort the array
        Arrays.sort(numbers);
        //check if length of array
        if (numbers.length<2){
            return -1;
        }
        //initialize the gcd with the smallest number
        int gcd=numbers[0];
        for(int i=0; i<numbers.length; i++){
            gcd=gcdTwo(gcd, numbers[i]);
        }
        return gcd;
    }

    public static int gcdTwo (int divisor, int dividend){
        while (divisor!=0){
            int temp= divisor;
            divisor= dividend%divisor;
            dividend=temp;
        }
        return dividend;
    }

    public static void main (String [] args){
        System.out.println(gcd(10,5,15,20,25));
    }
}
