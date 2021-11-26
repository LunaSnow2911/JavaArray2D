public class MathUtils {
    public static int findMaxInArrNum(int[] arrNum) {
        int result = arrNum[0];
        for (int i : arrNum) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

    public static int findMinInArrNum(int[] arrNum) {
        int result = arrNum[0];
        for (int i : arrNum) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }
}
