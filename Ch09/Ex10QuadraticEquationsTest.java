package Ch9;

import java.util.Scanner;

/**
 * Q: Design a class named
     QuadraticEquation for a quadratic equation ax2+bx+c=0 . The class
     contains:
     o Private data fields a , b , and c that represent three coefficients.
     o A constructor with the arguments for a , b , and c .
     o Three getter methods for a , b , and c .
     o A method named getDiscriminant() that returns the discriminant,
     which is b2−4ac.
     o The methods named getRoot1() and getRoot2() for returning two
     roots of the equation
     r1= −b+b2−4ac2a and r2= −b−b2−4ac2a
     These methods are useful only if the discriminant is nonnegative. Let
     these methods return 0 if the discriminant is negative.
     Draw the UML diagram for the class then implement the class. Write a test
     program that prompts the user to enter values for a, b, and c and displays
     the result based on the discriminant. If the discriminant is positive, display
     the two roots. If the discriminant is 0, display the one root. Otherwise,
     display “The equation has no roots.”
 * Created by aarushi on 23/6/21.
 */
public class Ex10QuadraticEquationsTest {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Value of a:");
        double a= sc.nextDouble();
        System.out.println("Enter Value of b:");
        double b= sc.nextDouble();
        System.out.println("Enter Value of c:");
        double c= sc.nextDouble();

        Ex10QuadraticEquations equation= new Ex10QuadraticEquations(a, b, c);
        double discriminant= equation.getDiscriminant();
        if(discriminant>0){
            System.out.printf("Root 1: %.3f", equation.getRoot1());
            System.out.printf("\nRoot 2: %.3f", equation.getRoot2());
        } else if(discriminant==0) {
            System.out.printf("The equation has one root: %.3f", equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }


    }
}

/*
    Sample Runs:

    Enter Value of a:
    1
    Enter Value of b:
    3
    Enter Value of c:
    1
    Root 1: -0.382
    Root 2: -2.618

    _______

    Enter Value of a:
    1
    Enter Value of b:
    2
    Enter Value of c:
    1
    The equation has one root: -1.000

    _______

    Enter Value of a:
    1
    Enter Value of b:
    2
    Enter Value of c:
    3
    The equation has no roots

 */
