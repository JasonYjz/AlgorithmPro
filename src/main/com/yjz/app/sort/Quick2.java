package main.com.yjz.app.sort;

public class Quick2 implements ISort {
    @Override
    public void solution(int[] array) {
        quickSort2(array, 0, array.length - 1);
    }

    private void quickSort2(int[] array, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition2(array, l, r);
        quickSort2(array, l, p - 1);
        quickSort2(array, p + 1, r);
    }

    private int partition2(int[] array, int l, int r) {
        // swap( array, l, random_i )
        int v = array[l];

        // array[l+1...i) <= v; array(j...r] >= v
        int i = l + 1, j = r;

        while (true) {
            while (i <= r && array[i] < v) {
                i++;
            }
            while (j >= l + 1 && array[j] > v) {
                j--;
            }

            if (i > j) {
                break;
            }

            SortUtil.swap(array, i, j);
            i++;
            j--;
        }

        SortUtil.swap(array, l, j);

        return j;
    }
}
