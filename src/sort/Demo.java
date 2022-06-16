package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Sergey.
 */
public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int count = 0;
        while (count < 10) {
            array[count] = random.nextInt();
            count++;
        }

        System.out.println(Arrays.toString(array));
        array = SelectionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
