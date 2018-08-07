package sorts;

/**
 * Created by nisar on 05-08-2018.
 */
public class BasicSorts {

    public static <T extends Comparable> T[] bubbleSort(T[] arr){
        return bubbleSort(arr, Order.asc);
    }

    public static <T extends Comparable> T[] bubbleSort(T[] arr, Order order){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(order == Order.asc) {
                    if (arr[j + 1].compareTo(arr[j]) < 0)
                        SortCommons.swap(arr, j, j + 1);
                }
                else{
                    if (arr[j + 1].compareTo(arr[j]) > 0)
                        SortCommons.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
    public static <T extends Comparable> T[] insertionSort(T[] arr){
        return insertionSort(arr, Order.asc);
    }

    public static <T extends Comparable> T[] insertionSort(T[] arr, Order order){
        if(arr.length == 0 || arr.length == 1)return arr;
        T value;
        int valueIndex,j;
        if(order == Order.asc) {
            for (int i = 1; i < arr.length; i++) {
                value = arr[i];
                j = i-1;
                while(j>=0 && arr[j].compareTo(value) > 0){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = value;
            }
        }
        else{
            for (int i = 1; i < arr.length; i++) {
                value = arr[i];
                j = i-1;
                while(j>=0 && arr[j].compareTo(value) < 0){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = value;
            }
        }
        return arr;
    }

    public static <T extends Comparable> T[] selectionSort(T[] arr){
        return selectionSort(arr, Order.asc);
    }

    public static <T extends Comparable> T[] selectionSort(T[] arr, Order order){
        if(arr.length == 0 || arr.length == 1)return arr;
        if(order == Order.asc) {
            T min;
            int minIndex;
            for (int i = 0; i < arr.length - 1; i++) {
                min = arr[i];
                minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j].compareTo(min) < 0) {
                        min = arr[j];
                        minIndex = j;
                    }
                }
                SortCommons.swap(arr, i, minIndex);
            }
        }
        else{
            T max;
            int maxIndex;
            for (int i = 0; i < arr.length - 1; i++) {
                max = arr[i];
                maxIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j].compareTo(max) > 0) {
                        max = arr[j];
                        maxIndex = j;
                    }
                }
                SortCommons.swap(arr, i, maxIndex);
            }
        }
        return arr;
    }
}
