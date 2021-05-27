package Ch7;

import static java.lang.Character.isUpperCase;

public class Ex22 {
    public static void main (String[] args){
        int count=0;
        for(int i=0; i<args.length; i++){
           for(int j=0; j<args[i].length(); j++){
               if(isUpperCase(args[i].charAt(j))){
                   count++;
               }
           }
        }

        System.out.println("Number of UpperCase letters: " + count);
    }
}

/*
    Input from Command Line: This is a BOOK
    Output:
    Number of UpperCase letters: 5
 */
