package leetcode.ciof2;



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
    public static void hammingWeight2(int n) {
        for (int i = 1; i <= (n/2+1);i*=2) {
            if( (n & i) == i ){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        hammingWeight2(31);
    }
}
