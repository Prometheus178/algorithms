package search;

/**
 * Author: Sergey.
 */
public class BinarySearch {

    /**
     * Count iterations not more than log_2(N)
     *
     * @param searchedNum
     * @param array
     * @return position of search number in array
     */
    public static int searchNumber(int searchedNum, int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high);
            int guess = array[mid];
            if (guess == searchedNum) {
                return mid;
            }
            if (guess > searchedNum) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
