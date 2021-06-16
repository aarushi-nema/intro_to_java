package Ch9;

/**
 * Q: Create a class which keeps track of the number of its objects
 * Created by aarushi on 16/6/21.
 */
public class ChEx06 {

    //values of static variables are same across all instances of the class
    static int numberOfObjects=0;
    //values of instance variables are different for each object
    int num;

    public ChEx06(int num){
        numberOfObjects++;
        this.num= num;
    }

    //static methods do not require an object to be accessed
    //static methods cannot access instance variables
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    //instance methods can be used only with objects of the class
    public int getNum(){
        return num;
    }

    /*
    Sample Output:
    Number of objects: 1
    Number of objects: 4
    Values of num:
    Object 1: 3
    Object 2: 56
    Object 3: 100
    Object 4: 2
     */
}
