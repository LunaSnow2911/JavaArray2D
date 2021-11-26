public class AllSort {
    public static void swapNum(int[] arr, int index1, int index2) {
        int m = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = m;
    }

    public static void bubbleSortNum(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    swapNum(arr, i + 1, i);
                }
            }
        }
    }

    public static void selectionSortNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            System.out.println(Arrays.toString(arr));
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swapNum(arr, minIndex, i);
            count++;
        }
        System.out.println("so lan thuc hien: " + count);
    }

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        System.out.println(Arrays.toString(arr));
        int middle = arr.length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[arr.length - middle];
        for (int i = 0; i < middle; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            rightArr[i - middle] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        Merge(arr, leftArr, rightArr);
    }

    public static void Merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        // int arr={};
        // arr.
    }
}
