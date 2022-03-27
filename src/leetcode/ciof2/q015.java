package leetcode.ciof2;


import java.util.Arrays;

/**
 * 二进制包含1的个数
 */
public class q015 {
    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }


    /**
     * 转换成10进制 里面包含的二进制数有多少
     * @param n
     * @return
     */
    public static int hammingWeight2(int n) {
        int res = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(n != 0){
                System.out.println(n);
            }
            n >>>= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(15));
    }
}
