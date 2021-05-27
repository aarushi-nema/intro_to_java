package Ch7;

/*
    Q: Write a program that passes an unspecified number of integers from command line and displays their total.
 */

public class Ex21 {

    public static void main (String [] args){
        int sum=0;

        for(int i=0; i< args.length; i++){
            sum+= Integer.parseInt(args[i]);
        }

        System.out.println("Sum of numbers: " +sum);
    }
}

/*
    Sample input/output

    args: ["1", "2", "3", "4", "5"]
    Sum of numbers: 15
 */
