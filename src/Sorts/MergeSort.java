package sorts;

/**
 * Created by nisar on 05-08-2018.
 */
public class MergeSort {
    public static int[] mergeSort(int[] arr, int low, int high){
        if(arr.length == 0)return arr;
        if(low == high){
            int[] newArray = new int[1];
            newArray[0] = arr[low];
            return newArray;
        }
        else{
            int mid = (high + low)/2;
            int[] left = mergeSort(arr, low, mid);
            int[] right = mergeSort(arr, mid+1, high);
            arr = merge(left, right);
            return arr;
        }
    }

    private static int[] merge(int[] left, int[] right){
        int i=0, j=0, k=0;
        int[] newArray = new int[left.length + right.length];
        while(i<left.length && j< right.length){
            newArray[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
        }
        while (i<left.length) newArray[k++] = left[i++];
        while (j<right.length) newArray[k++] = right[j++];
        return newArray;
    }
}
