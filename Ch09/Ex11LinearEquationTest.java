package Ch9;

import java.util.Scanner;

/**
 * Q: Design a class named LinearEquation for a 2×2 system of linear equations:
        ax+by=e
        cx+dy=f
        x=(e*d−b*f)/(a*d−b*c)
        y=(a*f−e*c)/(a*d−b*c)
     The class contains:
     o Private data fields a , b , c , d , e , and f .
     o A constructor with the arguments for a , b , c , d , e , and f .
     o Six getter methods for a , b , c , d , e , and f .
     o A method named isSolvable() that returns true if ad−bc is not 0.
     o Methods getX() and getY() that return the solution for the equation.
     Draw the UML diagram for the class then implement the class. Write a test
     program that prompts the user to enter a , b , c , d , e , and f and displays the
     result. If ad−bc is 0, report that “The equation has no solution.”

 * Created by aarushi on 23/6/21.
 */
public class Ex11LinearEquationTest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a= sc.nextDouble();
        System.out.println("Enter value of b: ");
        double b= sc.nextDouble();
        System.out.println("Enter value of c: ");
        double c= sc.nextDouble();
        System.out.println("Enter value of d: ");
        double d= sc.nextDouble();
        System.out.println("Enter value of e: ");
        double e= sc.nextDouble();
        System.out.println("Enter value of f: ");
        double f= sc.nextDouble();

        Ex11LinearEquation equation= new Ex11LinearEquation(a,b,c,d,e,f);

        if(equation.isSolvable()){
            System.out.printf("Value of x: %.3f", equation.getX());
            System.out.printf("\nValue of y: %.3f", equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}

/*
    Sample Run:

    Enter value of a:
    9
    Enter value of b:
    4
    Enter value of c:
    3
    Enter value of d:
    -5
    Enter value of e:
    -6
    Enter value of f:
    -21
    Value of x: -2.000
    Value of y: 3.000

    _________________________

    Enter value of a:
    1
    Enter value of b:
    2
    Enter value of c:
    2
    Enter value of d:
    4
    Enter value of e:
    4
    Enter value of f:
    5
    The equation has no solution
 */
