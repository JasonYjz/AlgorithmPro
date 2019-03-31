package main.com.yjz.app.sort;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
//        ISort selecSort = new Selection();
//        ISort insertSort = new Insertion();
        ISort quickSort = new Quick();

//        int n = 10000;
//
//        int[] testArray = SortUtil.generateRandomArray(n, 1, n);
//        int[] testArray2 = Arrays.copyOf(testArray, n);

        int[] testArray = new int[] {6,2,5,8,7,1,4,10,3,9};
//        SortUtil.testSort("Selection Sort", selecSort, testArray);
        SortUtil.testSort("Quick Sort", quickSort, testArray);
//        SortUtil.testSort("Insertion Sort", insertSort, testArray2);

    }
}
