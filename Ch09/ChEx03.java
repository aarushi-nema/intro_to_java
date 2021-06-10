package Ch9;

import javafx.geometry.Point2D;
import java.util.Scanner;

/**
 * Question: Create two Point2D object for a point with the specified x- and y- coordinates,
 * use the distance method to compute the distance between the two points, use the midpoint method to find the midpoint
 * of the line joining the two points, and use the toString() method to return a string representation of the point.
 *
 * Created by aarushi on 10/6/21.
 */
public class ChEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of point 1");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter coordinates of point 2");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2= new Point2D(x2, y2);

        System.out.println("Point 1 is " + p1.toString());
        System.out.println("Point 2 is " + p2.toString());

        System.out.println("The distance between Point 1 and Point 2 is " + p1.distance(p2));
        System.out.println("The midpoint of the line joining Point 1 and Point 2 is " + p1.midpoint(p2));
    }
}

/* Sample Input and Output

    Enter coordinates of point 1
    1 2
    Enter coordinates of point 2
    3 4
    Point 1 is Point2D [x = 1.0, y = 2.0]
    Point 2 is Point2D [x = 3.0, y = 4.0]
    The distance between Point 1 and Point 2 is 2.8284271247461903
    The midpoint of the line joining Point 1 and Point 2 is Point2D [x = 2.0, y = 3.0]
 */
