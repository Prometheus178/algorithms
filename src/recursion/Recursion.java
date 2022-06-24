package recursion;

/**
 * Author: Sergey.
 */
public class Recursion {

    public static int sum(int value) {
        if (value == 1) {
            return 1;
        }
        return 1 + sum(value - 1);
    }

    public static int sum(int[] array) {
        int value;
        if (array.length == 0) {
            return 0;
        }
        value = array[0];
        int[] ints = removeElement(array);
        return value + sum(ints);
    }

    public static int[] removeElement(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int[] newArray = new int[array.length - 1];
        for (int elem = 0; elem < array.length - 1; elem++) {
            newArray[elem] = array[elem + 1];
        }
        return newArray;
    }
}
