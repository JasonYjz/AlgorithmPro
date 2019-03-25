package main.com.yjz.app.sort;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ISort selecSort = new Selection();
        ISort insertSort = new Insertion();

        int n = 100000;

        int[] testArray = SortUtil.generateRandomArray(n, 1, n);
        int[] testArray2 = Arrays.copyOf(testArray, n);

        SortUtil.testSort("Selection Sort", selecSort, testArray);
        SortUtil.testSort("Insertion Sort", insertSort, testArray2);

    }
}
