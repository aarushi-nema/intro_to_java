package Ch9;

/**
 * ********************** LinearEquation **********************
 *
 * -a: double
 * -b: double
 * -c: double
 * -d: double
 * -e: double
 * -f: double
 *
 * __________________________
 *
 * +LinearEquation(double: a, double: b, double: c, double d, double e, double f)
 * +getA(): double
 * +getB(): double
 * +getC(): double
 * +getD(): double
 * +getE(): double
 * +getF(): double
 * +isSolvable(): boolean
 * +getX(): double
 * +getY(): double
 *
 * ***************************************************************
 *
 * Created by aarushi on 23/6/21.
 */
public class Ex11LinearEquation {
    
    /*Private data fields a, b, c, d, e, and f*/
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    /*A constructor with the arguments for a, b, c, d, e, and f*/
    public Ex11LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a= a;
        this.b= b;
        this.c= c;
        this.d= d;
        this.e= e;
        this.f= f;
    }

    /*Six getter methods for a, b, c, d, e, and f*/
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    /*A method named isSolvable() that returns true if ad−bc is not 0*/
    public boolean isSolvable(){
        return a*d - b*c != 0;
    }

    /*Methods getX() and getY() that return the solution for the equation.*/
    public double getX(){
        return (e*d - b*f)/(a*d - b*c);
    }

    public double getY(){
        return (a*f - e*c)/(a*d - b*c);
    }
}
