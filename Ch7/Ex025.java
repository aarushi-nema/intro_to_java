package Ch7;

/*
    Q: Write a method for solving a quadratic equation using the following header:
       public static int solveQuadratic(double[] eqn, double[] roots)
       The coefficients of a quadratic equation ax2+bx+c=0 are passed to the array eqn and the real roots are stored in roots.
       The method returns the number of real roots.
       Write a program that prompts the user to enter values for a, b, and c and displays the number of real roots and
       all real roots.
 */

/*
      r1 = (−b + b^2 −4ac)/2a and r2 = (−b − b^2  −4ac)/2a
      b2−4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots.
      If it is zero, the equation has one root (-b/2a). If it is negative, the equation has no real roots.
 */

/*
    Step 1: create array to store values of a, b, c and an array to store the roots
    Step 2: Prompt user to enter values of a,b,c
    Step 3: calculate discriminant
    Step 4: based on value, calculate the roots
 */

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        //Step 1: create array to store values of a, b, c and an array to store the roots
        double[] eqn= new double[3];
        double[] roots= new double[2];

        //Step 2: Prompt user to enter values of a,b,c
        inputEqn(eqn);
        int numberOfRoots= solveQuadratic(eqn, roots);
        displayResults(roots, numberOfRoots);
    }

    public static void inputEqn(double[] eqn){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<eqn.length; i++){
            System.out.println("Enter value of " + (char)(97+i));
            eqn[i]= sc.nextDouble();
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots){
        //Step 3: calculate discriminant
        double discriminant= calculateDiscriminant(eqn);

        //Step 4: based on value, calculate the roots
        if(discriminant>0){
            findRoot(eqn, roots, discriminant);
            return 2;
        } else if (discriminant==0){
            findRoot(eqn, roots);
            return 1;
        }
        return 0;
    }

    public static double calculateDiscriminant(double[] eqn){
        return ((eqn[1]*eqn[1])-(4*eqn[0]*eqn[2]));
    }

    public static void findRoot(double[] eqn, double[] roots, double discriminant){
        roots[0]= (-eqn[1]+Math.sqrt(discriminant))/(2*eqn[0]);
        roots[1]= (-eqn[1]-Math.sqrt(discriminant))/(2*eqn[0]);
    }

    public static void findRoot(double[] eqn, double[] roots){
        roots[0]=(-eqn[1])/(2*eqn[0]);
    }

    public static void displayResults(double[] roots, int numberOfRoots){
        if(numberOfRoots==2){
            System.out.println("Roots of equation: " + roots[0] + " and " + roots[1]);
        } else if (numberOfRoots==1){
            System.out.println("Roots of equation: " + roots[0]);
        } else {
            System.out.println("No real roots");
        }
    }
}

/*
    Sample Input/ Output

    Enter value of a
    1
    Enter value of b
    -5
    Enter value of c
    -14
    Roots of equation: 7.0 and -2.0

 */
