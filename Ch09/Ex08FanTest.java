package Ch9;

/**
 * Question: (The Fan class) Design a class named Fan to represent a fan. The class contains:
     o Three constants named SLOW , MEDIUM , and FAST with the values 1 , 2 ,
     and 3 to denote the fan speed.
     o A private int data field named speed that specifies the speed of the
     fan (the default is SLOW ).
     o A private boolean data field named on that specifies whether the fan is
     on (the default is false ).
     o A private double data field named radius that specifies the radius of
     the fan (the default is 5 ).
     o A string data field named color that specifies the color of the fan (the
     default is blue ).
     o The accessor and mutator methods for all four data fields.o A no-arg constructor that creates a default fan.
     o A method named toString() that returns a string description for the
     fan. If the fan is on, the method returns the fan speed, color, and radius
     in one combined string. If the fan is not on, the method returns the fan
     color and radius along with the string “fan is off” in one combined
     string.
     Draw the UML diagram for the class then implement the class. Write a test
     program that creates two Fan objects. Assign maximum speed, radius 10 ,
     color yellow , and turn it on to the first object. Assign medium speed, radius
     5 , color blue , and turn it off to the second object. Display the objects by
     invoking their toString method.

     * Created by aarushi on 21/6/21.
 */
public class Ex08FanTest {
    public static void main (String[] args){
        Ex08Fan fan1= new Ex08Fan();
        Ex08Fan fan2= new Ex08Fan();

        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        fan2.setOn(true);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1:\n" + fan1.toString());
        System.out.println("\nFan 2:\n" + fan2.toString());

    }
}

/**
 * Output:
 *
    Fan 1:
    Fan Speed: 3
    Color: yellow
    Radius: 10.0

    Fan 2:
    Fan is off
    Color: blue
    Radius: 5.0

 * */