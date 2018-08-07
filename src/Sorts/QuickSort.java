package Sorts;

/**
 * Created by nisar on 06-08-2018.
 */
public class QuickSort {
    public static int[] quicksort(int[] arr, int left, int right){
        if(left >= right)return arr;
        int pivot = arr[right];
        int partition_index = partition(arr, left, right, pivot);
        quicksort(arr, left, partition_index-1);
        quicksort(arr, partition_index + 1, right);
        return arr;
    }
    private static int partition(int arr[], int left, int right, int pivot){
        int left_ptr = left - 1;
        int right_ptr = right;
        while(true){
            while(arr[++left_ptr]<pivot);
            while(arr[--right_ptr]>pivot);
            if(left_ptr < right_ptr)SortCommons.swap(arr, left_ptr, right_ptr);
            else break;
        }
        SortCommons.swap(arr, left_ptr, right);
        return left_ptr;
    }
}
