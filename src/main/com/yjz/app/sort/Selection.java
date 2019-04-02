package main.com.yjz.app.sort;

import java.util.ArrayList;

//选择排序
public class Selection implements ISort{

    @Override
    public void solution(int[] array) {
        for(int i = 0; i < array.length; i++) {
            //search the minimum value at the [i,n) range
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            SortUtil.swap(array, i, minIndex);
        }

    }
}
