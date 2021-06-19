package Ch9;

import java.util.Random;

/**
 * Created by aarushi on 19/6/21.
 */
public class Ex06StopwatchTest {
    public static void main(String[] args){
        Ex06Stopwatch stopwatch= new Ex06Stopwatch();
        Random random= new Random(5);
        int[] array= new int[100000];

        for(int i=0; i<100000; i++) {
            array[i] = random.nextInt(100);
        }

        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();

        System.out.println("Time taken to sort an integer array of 100000 integers is " + stopwatch.getElapsedTime() + " milliseconds");

    }

    public static void selectionSort(int[] array){
        int index=0;
        for(int i=0; i<100000; i++) {
            int small = array[i];
            for (int j = index; j < 100000; j++) {
                if (array[j] > array[small]) {
                    small = j;
                }
            }

            if (small != i) {
                int temp = array[i];
                array[i] = array[small];
                array[small] = temp;
            }
            index++;
        }

    }
}
