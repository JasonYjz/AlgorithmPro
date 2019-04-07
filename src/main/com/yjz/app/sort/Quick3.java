package main.com.yjz.app.sort;

public class Quick3 implements ISort {
    @Override
    public void solution(int[] array) {
        quickSort3(array, 0, array.length - 1);
    }

    private void quickSort3(int[] array, int l, int r) {
        if (l >= r) {
            return;
        }

        int v = array[l];
        // a[l+1...lt] < v; a[lt+1...i-1] = v; a[gt...r] > v
        int lt = l, gt = r + 1;
        int i = l + 1;   // a[lt+1...i) = v

        while (i < gt) {
            if (array[i] < v) {
                SortUtil.swap(array, i, lt + 1);
                i++;
                lt++;
            }
            else if (array[i] > v) {
                SortUtil.swap(array, i, gt - 1);
                gt--;
            }
            else { //array[i] = v
                i++;
            }
        }

        SortUtil.swap(array, l, lt);

        quickSort3(array, l, lt - 1);
        quickSort3(array, gt, r);
    }


}
