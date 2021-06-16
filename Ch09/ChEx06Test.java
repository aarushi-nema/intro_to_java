package Ch9;

/**
 * Created by aarushi on 16/6/21.
 */
public class ChEx06Test {
    public static void main (String[] args){
        ChEx06 obj1= new ChEx06(3);
        System.out.println("Number of objects: " + ChEx06.getNumberOfObjects());
        ChEx06 obj2= new ChEx06(56);
        ChEx06 obj3= new ChEx06(100);
        ChEx06 obj4= new ChEx06(2);
        System.out.println("Number of objects: " + ChEx06.getNumberOfObjects());
        System.out.println("Values of num: ");
        System.out.println("Object 1: " + obj1.getNum());
        System.out.println("Object 2: " + obj2.getNum());
        System.out.println("Object 3: " + obj3.getNum());
        System.out.println("Object 4: " + obj4.getNum());
    }
}
