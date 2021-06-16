package Ch9;

/**
 * Created by aarushi on 16/6/21.
 */
public class Ex01RectangleTest {

    public static void main (String [] args){
        Ex01Rectangle rectangle1= new Ex01Rectangle(4, 40);
        Ex01Rectangle rectangle2= new Ex01Rectangle(3.5, 35.9);
        System.out.println("Width of Rectangle 1: " + rectangle1.width);
        System.out.println("Height of Rectangle 1: " + rectangle1.height);
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());
        System.out.println("\nWidth of Rectangle 2: " + rectangle2.width);
        System.out.println("Height of Rectangle 2: " + rectangle2.height);
        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());
    }
}
