package Sorts;

import com.sun.corba.se.impl.resolver.ORBDefaultInitRefResolverImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Sorts.SortCommons.printArray;

/**
 * Created by nisar on 05-08-2018.
 */
public class BasicSortsTests {

    Integer [] intArray = {6,4,9,3,1,5,7,8,0,2};
    String [] stringArray = {"zzz", "zzy", "bbb", "aaa"};
    Float[] floatArray = {1.1f, 6.12f, 3.15f, 5.5f, 10.11f, 310.11f};

    @Test
    public void bubbleSortAsc(){
        BasicSorts.bubbleSort(intArray);
        printArray(intArray);
        validate(intArray, Order.asc);
        if(!validate(intArray, Order.asc))Assertions.fail("Incorrect Response");
        BasicSorts.bubbleSort(stringArray);
        printArray(stringArray);
        validate(stringArray, Order.asc);
        if(!validate(stringArray, Order.asc))Assertions.fail("Incorrect Response");
        BasicSorts.bubbleSort(floatArray, Order.asc);
        printArray(floatArray);
        if(!validate(floatArray, Order.asc))Assertions.fail("Incorrect Response");
    }

    @Test
    public void bubbleSortDesc(){
        BasicSorts.bubbleSort( intArray, Order.desc);
        printArray(intArray);
        if(!validate(intArray, Order.desc))Assertions.fail("Incorrect Response");
        BasicSorts.bubbleSort(stringArray, Order.desc);
        printArray(stringArray);
        if(!validate(stringArray, Order.desc))Assertions.fail("Incorrect Response");
        BasicSorts.bubbleSort(floatArray, Order.desc);
        printArray(floatArray);
        if(!validate(floatArray, Order.desc))Assertions.fail("Incorrect Response");
    }

    @Test
    public void insertionSortAsc(){
        BasicSorts.insertionSort(intArray);
        printArray(intArray);
        validate(intArray, Order.asc);
        if(!validate(intArray, Order.asc))Assertions.fail("Incorrect Response");
        BasicSorts.insertionSort(stringArray);
        printArray(stringArray);
        validate(stringArray, Order.asc);
        if(!validate(stringArray, Order.asc))Assertions.fail("Incorrect Response");
        BasicSorts.insertionSort(floatArray, Order.asc);
        printArray(floatArray);
        if(!validate(floatArray, Order.asc))Assertions.fail("Incorrect Response");
    }

    @Test
    public void insertionSortDesc(){
        BasicSorts.insertionSort( intArray, Order.desc);
        printArray(intArray);
        if(!validate(intArray, Order.desc))Assertions.fail("Incorrect Response");
        BasicSorts.insertionSort(stringArray, Order.desc);
        printArray(stringArray);
        if(!validate(stringArray, Order.desc))Assertions.fail("Incorrect Response");
        BasicSorts.insertionSort(floatArray, Order.desc);
        printArray(floatArray);
        if(!validate(floatArray, Order.desc))Assertions.fail("Incorrect Response");
    }

    @Test
    public void selectionSortAsc(){
        BasicSorts.selectionSort(intArray);
        printArray(intArray);
        validate(intArray, Order.asc);
        if(!validate(intArray, Order.asc))Assertions.fail("Incorrect Response");
        BasicSorts.selectionSort(stringArray);
        printArray(stringArray);
        validate(stringArray, Order.asc);
        if(!validate(stringArray, Order.asc))Assertions.fail("Incorrect Response");
        BasicSorts.selectionSort(floatArray, Order.asc);
        printArray(floatArray);
        if(!validate(floatArray, Order.asc))Assertions.fail("Incorrect Response");
    }

    @Test
    public void selectionSortDesc(){
        BasicSorts.selectionSort( intArray, Order.desc);
        printArray(intArray);
        if(!validate(intArray, Order.desc))Assertions.fail("Incorrect Response");
        BasicSorts.selectionSort(stringArray, Order.desc);
        printArray(stringArray);
        if(!validate(stringArray, Order.desc))Assertions.fail("Incorrect Response");
        BasicSorts.selectionSort(floatArray, Order.desc);
        printArray(floatArray);
        if(!validate(floatArray, Order.desc))Assertions.fail("Incorrect Response");
    }

    public static <T extends Comparable> boolean validate(T[]arr, Order order){
        if(arr.length == 1)return true;
        if(order == Order.asc) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1].compareTo(arr[i]) < 0) return false;
            }
            return true;
        }
        else{
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1].compareTo(arr[i]) > 0) return false;
            }
            return true;
        }
    }

}
