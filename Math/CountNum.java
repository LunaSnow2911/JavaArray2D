
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountNum {

    public static int countInGeneral(int a, int b, int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i >= a && i < b) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\LunaSnow\\Desktop\\bai7.1.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);
        String line = bufferedReader.readLine();
        bufferedReader.close();
        fr.close();
        String[] temp = line.split(" ");
        int[] arrNum = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arrNum[i] = Integer.parseInt(temp[i]);
        }
        int n = 56;
        int a = (countInGeneral(20, 28, arrNum));
        int b = (countInGeneral(28, 36, arrNum));
        int c = (countInGeneral(36, 44, arrNum));
        int d = (countInGeneral(44, 52, arrNum));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(n - (a + b + c + d));

    }

}
