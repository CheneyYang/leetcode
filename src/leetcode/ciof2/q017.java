package leetcode.ciof2;

import java.util.Arrays;

public class q017 {

    public static int[] printNumbers(int n) {
        //pow 表示"参数1"的“参数2”次方 下面表示的是10的次方
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }

    public static void main(String[] args) {
        int[] ints = printNumbers(4);
        System.out.println(Arrays.toString(ints));
    }
}
