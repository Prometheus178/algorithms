package sort;

import java.util.Arrays;

/**
 * Author: Sergey.
 */
public class MergeSort {

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int leftStart, int mid, int rightEnd) {
        int leftEnd = mid;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        int left = leftStart; /* initial index of first sub-array */
        int right = rightStart; /* initial index of second sub-array */
        int index = leftStart; /* initial index of merged sub-array */
        /* temporary Array */
        int[] temp = new int[arr.length];
        while (left <= leftEnd && right <= rightEnd){
            if (arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        /* copy data to temp arrays */
        System.arraycopy(arr, left, temp, index, leftEnd - left +1);
        System.arraycopy(arr, right, temp, index, rightEnd - right +1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
}
