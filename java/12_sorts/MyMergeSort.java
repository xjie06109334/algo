
/**
 * @author xjie
 * @description
 * @date 2020-10-28 14:51
 */
public class MyMergeSort {
    //归并排序算法，arr是数组，n是数组大小
    public static void mergeSort(int[] arr, int n) {
        mergeSortC(arr, 0, n - 1);
    }

    //递归调用函数
    private static void mergeSortC(int[] arr, int p, int r) {
        if (p >= r) return;
        // 取p，r中间位置q
        //int q = (p+r)/2;
        // 取p到r之间的中间位置q,防止（p+r）的和超过int类型最大值
        int q = p + (r - p) / 2;
        //分治递归
        mergeSortC(arr, p, q);
        mergeSortC(arr, q + 1, r);
        //将arr[p...q],arr[q+1...r]合并为arr[p...r]
        merge(arr, p, q, r);
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] temp = new int[r - p];
        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //判断[p...q],[q+1...r]哪部分还有数据，则将这部分数据街道temp后面
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        while (start <= end) {
            temp[k++] = arr[start];
        }
        //将temp数组的数据copy会arr[p...r]
        for (i = 0; i <= r - p; i++) {
            arr[p + i] = temp[i];
        }
    }

    private static void mergeBySentry(int[]arr ,int p,int q,int r){
        int[] leftArr = new int[q-p+1];
    }

    public static void main(String[] args) {
        int i = 0;
        int j =3;
        int k = (i+j)/2;
        System.out.println(k);
    }
}
