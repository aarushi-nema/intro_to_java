package Ch9;

/**
 * ********************** QuadraticEquations **********************
 *
 * -a: double
 * -b: double
 * -c: double
 * _____________________________________
 *
 * +QuadraticEquations(double: a, double: b, double: c)
 * +getA(): double
 * +getB(): double
 * +getC(): double
 * +getDiscriminant(): double
 * +getToot1(): double
 * +getRoot2(): double
 *
 * ****************************************************************
 *
 * Created by aarushi on 23/6/21.
 */
public class Ex10QuadraticEquations {

    /*Private data fields a , b , and c that represent three coefficients.*/
    private double a;
    private double b;
    private double c;

    /*A constructor with the arguments for a , b , and c*/
    public Ex10QuadraticEquations(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /*Three getter methods for a , b , and c .*/
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public  double getC(){
        return c;
    }

    /*A method named getDiscriminant() that returns the discriminant, which is b2−4ac*/
    public double getDiscriminant(){
        return (Math.pow(b,2)-(4*a*c));
    }

    /*The methods named getRoot1() and getRoot2() for returning two roots of the equation*/
    public double getRoot1(){
        double discriminant= getDiscriminant();
        if(discriminant<0){
            return 0;
        } else if (discriminant==0){
            return -b/(2*a);
        }
        return (-b+Math.sqrt(discriminant))/(2*a);
    }

    public double getRoot2(){
        double discriminant= getDiscriminant();
        if(discriminant<=0){
            return 0;
        }
        return (-b-Math.sqrt(discriminant))/(2*a);
    }
}
