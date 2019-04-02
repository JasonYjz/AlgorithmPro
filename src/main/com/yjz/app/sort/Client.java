package main.com.yjz.app.sort;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
//        ISort selecSort = new Selection();
        ISort insertSort = new Insertion();
        ISort quickSort = new Quick();
        ISort quickSort2 = new Quick2();

        int n = 100000;

//        int[] testArray = SortUtil.generateNearlyOrderedArray(50, 10);
        int[] testArray = SortUtil.generateRandomArray(n, 0, 10);
        int[] testArray1 = SortUtil.copyIntArray(testArray, n);
        int[] testArray2 = SortUtil.copyIntArray(testArray, n);

//        SortUtil.testSort("Selection Sort", selecSort, testArray);
//        SortUtil.testSort("Selection Sort", selecSort, testArray);
        SortUtil.testSort("Quick Sort", quickSort, testArray);
        SortUtil.testSort("Quick Sort2", quickSort2, testArray1);
        SortUtil.testSort("Insertion Sort", insertSort, testArray2);

    }
}
