package search;

/**
 * Author: Sergey.
 */
public class Demo {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 12, 20, 30};
        print(BinarySearch.searchNumber(1, array));
        print(BinarySearch.searchNumber(30, array));
        print(BinarySearch.searchNumber(50, array));
    }

    private static void print(Object i) {
        System.out.println(i);
    }
}
