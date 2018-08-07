package Sorts;

/**
 * Created by nisar on 05-08-2018.
 */
public class SortCommons {
    public static <T> void printArray(T[] arr){
        for(T element : arr){
            System.out.print( element + " --> ");
        }
        System.out.println("End");
    }

    public static void printArray(int[] arr){
        for(int element : arr){
            System.out.print( element + " --> ");
        }
        System.out.println("End");
    }

    public static <T> void swap(T a[],int i,int j){
        T temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public static void swap(int a[],int i,int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
