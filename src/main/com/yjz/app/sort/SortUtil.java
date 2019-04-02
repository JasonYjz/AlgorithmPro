package main.com.yjz.app.sort;

import java.util.Arrays;
import java.util.Random;

public abstract class SortUtil {
    public static void swap(int[] array, int i, int j) {
        assert (array == null);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] copyIntArray(int[] arr, int n) {
        return Arrays.copyOf(arr, n);
    }

    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
        assert (rangeL <= rangeR);
        int[] arr = new int[n];

        Random ran = new Random();
        for (int i = 0; i < n; i++ ) {
            arr[i] = ran.nextInt(rangeR+1) % (rangeR - rangeL + 1) + rangeL;
        }

        return arr;
    }

    public static int[] generateNearlyOrderedArray(int n, int swaptimes) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        Random ran = new Random();

        for (int i = 0; i < swaptimes; i++) {
            int posx = ran.nextInt(n)%n;
            int posy = ran.nextInt(n)%n;

            swap(arr, posx, posy);
        }

        return arr;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(String.valueOf(array[i]) + " ");
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void testSort(String sortName, ISort sort, int[] arr) {
        long startTime=System.nanoTime();   //获取开始时间

        sort.solution(arr);

        long endTime=System.nanoTime(); //获取结束时间

        assert (isSorted(arr));

        System.out.printf(sortName + ": " + String.valueOf((double)(endTime-startTime)/1000000) + " ms\n");
    }
}
