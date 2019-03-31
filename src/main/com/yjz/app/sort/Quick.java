package main.com.yjz.app.sort;

public class Quick implements ISort {
    @Override
    public void solution(int[] array) {
        System.out.printf("    index=0 1 2 3 4 5 6 7 8  9");
        System.out.println();
        System.out.printf("    array=");
        SortUtil.printArray(array);
        System.out.println();
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int l, int r) {
        if (l>=r) {
            return;
        }

        int p = partition(array, l, r);
        System.out.printf("p="+String.valueOf(p)+" array=");
        SortUtil.printArray(array);
        System.out.println();
        quickSort(array, l, p-1);
//        System.out.println("===============================");
        quickSort(array, p+1, r);
    }

    // find the index 'p',
    // let array[l...p-1] < array[p], array[p+1...r] > array[p]
    private int partition(int[] array, int l, int r) {
        int v = array[l];

        // array[l+1...j] < v ; array[j+1...i) > v
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if ( array[i] < v) {
                SortUtil.swap(array, j+1, i);
                j++;
            }
        }

        SortUtil.swap(array, l, j);
        return j;
    }
}
