import java.util.Arrays;

public class Array2DUtils {
    public static int sizeOfArr2d(int[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result++;
            }
        }
        return result;
    }

    public static String toString2D(int[][] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j] + "\t";
            }
            result += "\n";
        }
        return result;
    }

    public static int[] convert2DTo1D(int[][] arr) {

        int[] result = new int[sizeOfArr2d(arr)];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[temp] = arr[i][j];
                temp++;
            }
        }
        return result;
    }

    public static boolean checkGoodArray2D(int[][] arr) {
        boolean result = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length == arr[i].length) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkEqualsMatrix(int[][] arr1, int[][] arr2) {
        boolean result = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.toString(convert2DTo1D(arr1)));
    }
}
