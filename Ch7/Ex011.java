package Ch7;

/*
    Q: Write a program that takes 10 elements as input for a double array and calculates the mean and 
       standard deviation of the elements. 
       Mean= (n1+n2+n3+...+nl)/l
       Standard deviation= sqrt((summation(xi-mean)^2)/l)
       
       l= total number of elements
 */

import java.util.Scanner;

public class Ex11 {

    final static int SIZE= 10;

    public static double deviation (double[] x, double mean){
        double standardDeviation=0;

        for(int i=0; i<x.length; i++){
            double temp= x[i] - mean;
            temp*=temp;
            standardDeviation+=temp;
        }
        standardDeviation/=(x.length);
        standardDeviation= Math.sqrt(standardDeviation);

        return standardDeviation;
    }

    public static double mean (double[] x){
        double mean=0;
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
            mean+=x[i];
        }
        mean/=(x.length);
        return mean;
    }

    public static void input (double[] x){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 elements of array: ");
        for(int i=0; i<x.length; i++){
            x[i]=sc.nextDouble();
        }
    }

    public static void main (String[] args){
        double [] x= new double[SIZE];
        input(x);
        double m= mean(x);
        System.out.println("Mean: " + m);
        System.out.println("Standard Deviation: " + deviation(x, m));

    }
}
