package Ch9;

/**
 * ********************** RegularPolygon **********************
 *
 * -n: int
 * -side: double
 * -x: double
 * -y: double
 *
 * __________________________________
 *
 * +RegularPolygon()
 * +RegularPolygon(int: n, double side)
 * +RegularPolygon(int: n, double: side, int: x, int: y)
 * +getN(): int
 * +setN(int: n)
 * +getSide(): double
 * +setSide(double: side)
 * +getX(): double
 * +setX(double: x)
 * +getY(): double
 * +setY(double: y)
 * getPerimeter(): double
 * getArea(): double
 *
 * *************************************************************
 *
 * Created by aarushi on 23/6/21.
 */
public class Ex09RegularPolygon {

    private int n; //number of sides of polygon
    private double side; //side length of polygon
    private double x; //x-coordinate of center of polygon
    private double y; //y-coordinate of center of polygon

    /*A no-arg constructor that creates a regular polygon with default values*/
    public Ex09RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }

    /*A constructor that creates a regular polygon with the specified number of sides and length of side, centered at ( 0 , 0 ).*/
    public Ex09RegularPolygon(int n, double side){
        this.n=n;
        this.side= side;
        x=0;
        y=0;
    }

    /*A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.*/
    public Ex09RegularPolygon(int n, double side, double x, double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    /*The accessor and mutator methods for all data fields.*/
    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n=n;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side=side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*The method getPerimeter() that returns the perimeter of the polygon*/
    public double getPerimeter(){
        return n*side;
    }

    /*The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon*/
    public double getArea(){
        return (n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
    }
}
