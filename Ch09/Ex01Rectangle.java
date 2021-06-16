package Ch9;

/**
 * Q: Design a class named Rectangle to represent a rectangle. The class contains:
        1. Two double data fields named width and height that specify the
        width and height of the rectangle. The default values are 1 for both width and height .
       2. A no-arg constructor that creates a default rectangle.
       3. A constructor that creates a rectangle with the specified width and height .
       4. A method named getArea() that returns the area of this rectangle.
       5. A method named getPerimeter() that returns the perimeter.
    Write a test program that creates two Rectangle objects—one with width 4 and height
    40 , and the other with width 3.5 and height 35.9 . Display the width, height,
    area, and perimeter of each rectangle in this order.

 * Created by aarushi on 16/6/21.
 */

public class Ex01Rectangle {
    double width;
    double height;

    public Ex01Rectangle(){
        width=1;
        height=1;
    }

    public Ex01Rectangle(double width, double height){
        this.width=width;
        this.height= height;
    }

    public double getArea(){
        return (width*height);
    }

    public double getPerimeter(){
        return (2*(width+height));
    }

    /*
    Sample Output

    Width of Rectangle 1: 4.0
    Height of Rectangle 1: 40.0
    Area of Rectangle 1: 160.0
    Perimeter of Rectangle 1: 88.0

    Width of Rectangle 2: 3.5
    Height of Rectangle 2: 35.9
    Area of Rectangle 2: 125.64999999999999
    Perimeter of Rectangle 2: 78.8
     */
}
