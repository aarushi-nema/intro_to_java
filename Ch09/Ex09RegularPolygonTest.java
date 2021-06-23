package Ch9;

/**
 * Q: In an n-sided regular polygon,
     all sides have the same length and all angles have the same degree (i.e., the
     polygon is both equilateral and equiangular). Design a class named
     RegularPolygon that contains:
     o A private int data field named n that defines the number of sides in
     the polygon with default value 3 .
     o A private double data field named side that stores the length of the
     side with default value 1 .
     o A private double data field named x that defines the x-coordinate of
     the polygon’s center with default value 0 .
     o A private double data field named y that defines the y-coordinate of
     the polygon’s center with default value 0 .
     o A no-arg constructor that creates a regular polygon with default values.
     o A constructor that creates a regular polygon with the specified number
     of sides and length of side, centered at ( 0 , 0 ).
     o A constructor that creates a regular polygon with the specified number
     of sides, length of side, and x- and y-coordinates.
     o The accessor and mutator methods for all data fields.o The method getPerimeter() that returns the perimeter of the polygon.
     o The method getArea() that returns the area of the polygon. The
     formula for computing the area of a regular polygon is
     Area=(n*side^2)/[4*tan (Pi/n)].
     Draw the UML diagram for the class then implement the class. Write a test
     program that creates three RegularPolygon objects, created using the no-
     arg constructor, using RegularPolygon(6, 4) , and using
     RegularPolygon(10, 4, 5.6, 7.8) . For each object, display its perimeter
     and area.
 * Created by aarushi on 23/6/21.
 */
public class Ex09RegularPolygonTest {
    public static void main(String[] args){
        Ex09RegularPolygon polygon1= new Ex09RegularPolygon();
        Ex09RegularPolygon polygon2= new Ex09RegularPolygon(6,4);
        Ex09RegularPolygon polygon3= new Ex09RegularPolygon(10, 4, 5.6, 7.8);
        System.out.printf("Perimeter of polygon 1: %.3f", polygon1.getPerimeter());
        System.out.printf("\nArea of polygon 1: %.3f", polygon1.getArea());
        System.out.printf("\nPerimeter of polygon 2: %.3f", polygon2.getPerimeter());
        System.out.printf("\nArea of polygon 2: %.3f", polygon2.getArea());
        System.out.printf("\nPerimeter of polygon 3: %.3f", polygon3.getPerimeter());
        System.out.printf("\nArea of polygon 3: %.3f", polygon3.getArea());
    }
}

/*
    Output:
    Perimeter of polygon 1: 3.000
    Area of polygon 1: 0.433
    Perimeter of polygon 2: 24.000
    Area of polygon 2: 41.569
    Perimeter of polygon 3: 40.000
    Area of polygon 3: 123.107
 */

