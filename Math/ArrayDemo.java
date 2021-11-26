/**
 * ArrayDemo
 */
public class ArrayDemo {

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

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 5, 4, 2 } };
        System.out.println(toString2D(arr1));
        System.out.println(sizeOfArr2d(arr1));
    }
}