package Ch9;

/*
    Q: Create a class Circle which has data field radius. If no radius is passed during instantiation then set the
    radius to 1. Write method to calculate circumference, area, and to reset the radius.

    Write another class TestCircle to create three Circle objects with radius 1, 25, and 50 respectively. The test
    class should display the radius, area, and circumference of all three objects. Also, reset the third circle's
    radius to 100 and display its radius, area, and circumference.
 */

public class Circle {

    final double PI= 3.14;
    double radius;

    Circle(){
        radius=1;
    }

    Circle(double radius){
        this.radius= radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getCircumference(){
        return 2*PI*radius;
    }

    public void setRadius(double radius){
        this.radius= radius;
    }

}

/* *********************************** In a different file *********************************** */

package Ch9;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1= new Circle();
        displayObject(circle1);

        Circle circle2= new Circle(25);
        displayObject(circle2);

        Circle circle3= new Circle(50);
        displayObject(circle3);

        circle3.radius= 100;
        displayObject(circle3);
    }

    public static void displayObject (Circle circle){
        System.out.println("The first circle has a radius of " + circle.radius + " units and an area of " + circle.getArea() + " square units and a circumference of " + circle.getCircumference()+ " units");

    }
}

/*
  Test
  
  The first circle has a radius of 1.0 units and an area of 3.14 square units and a circumference of 6.28 units
  The first circle has a radius of 25.0 units and an area of 1962.5 square units and a circumference of 157.0 units
  The first circle has a radius of 50.0 units and an area of 7850.0 square units and a circumference of 314.0 units
  The first circle has a radius of 100.0 units and an area of 31400.0 square units and a circumference of 628.0 units
*/
