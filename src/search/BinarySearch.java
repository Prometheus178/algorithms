package search;

/**
 * Author: Sergey.
 */
public class BinarySearch {

    /**
     * Count iterations not more than log_2(N)
     * 1. Find borders
     * 2. Using while to iterate before we find the most close position of num or needed positions num
     * 3. find mid position by separate 2
     * 4. if mid num equals finding num return position
     * 5. if guess num < mid then mid is to be high position or vice versa
     *
     * @param searchedNum
     * @param array
     * @return position of search number in array
     */
    public static int searchNumber(int searchedNum, int[] array) {
        int lowBorder = 0;
        int highBorder = array.length - 1;
        while (lowBorder <= highBorder) {
            int mid = (lowBorder + highBorder) / 2;
            int guessNum = array[mid];
            if (searchedNum == guessNum) {
                return mid;
            }
            if (searchedNum < guessNum) {
                highBorder = mid - 1;
            } else {
                lowBorder = mid + 1;
            }
        }
        return -1;
    }
}
