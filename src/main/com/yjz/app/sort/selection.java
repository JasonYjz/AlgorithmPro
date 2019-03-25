package main.com.yjz.app.sort;

import java.util.ArrayList;

//选择排序
public class selection {

    public static int impl(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            swap(arr[i], arr[minIndex]);

        }

        return 0;
    }

    private static void swap(int i, int i1) {
        int temp = i;

    }
}
