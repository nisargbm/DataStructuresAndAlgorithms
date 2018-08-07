package Sorts;

/**
 * Created by nisar on 06-08-2018.
 */
public class HeapSort {
    public static int[] heapSort(int[] arr){
        int length = arr.length;
        for(int i=length/2 - 1; i>=0; i--)
            heapify(arr, length, i);
        for(int i = length - 1; i>=0; i--){
            SortCommons.swap(arr, i, 0);
            heapify(arr, i, 0);
        }
        return arr;
    }
    private static void heapify(int[] arr, int length, int index){
        int largest = index;
        int left = 2*index + 1;
        int right = 2*index + 2;
        if(left < length && arr[left] > arr[largest])largest = left;
        if(right < length && arr[right] > arr[largest])largest = right;
        if(index != largest){
            SortCommons.swap(arr, index, largest);
            heapify(arr, length, largest);
        }
    }
}
