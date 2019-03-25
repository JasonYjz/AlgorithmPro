package main.com.yjz.app.sort;

public class Insertion implements ISort {
    @Override
    public int[] solution(int[] array) {
        assert (array != null);

        for (int i = 1; i < array.length; i++) {
            // 寻找元素array[i]合适的插入位置
            for (int j = i; j > 0 && array[j] > array[j - 1]; j--) {
                SortUtil.swap(array, j, j - 1);
            }

//            //改进版本
//            int e = array[i];
//            int j; //保持e应该插入的位置
//            for(j = i; j > 0 && array[j - 1] > e; j--) {
//                array[j] = array[j - 1];
//            }
//
//            array[j] = e;
        }
        return array;
    }
}
