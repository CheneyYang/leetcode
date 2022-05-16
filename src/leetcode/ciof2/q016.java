package leetcode.ciof2;

/**
 * 数值的整数次方
 * Description:
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 *
 * 示例 1：
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 *
 *
 * @Author: YangGC
 * DateTime: 05-16
 */
public class q016 {

    public static void main(String[] args) {

    }

    double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x,long N){
        double ans = 1.0;
        //贡献的初始值为x
        double x_contribute = x;
        //在对N进行二进制拆分的同时计算答案
        while (N > 0) {
            if (N % 2 == 1) {
                //如果N二进制表示的最低位为1,那么需要计入共享
                ans *= x_contribute;
            }
        // 将贡献不断的平方
            x_contribute *= x_contribute;
        //舍弃N二进制表示最低位,这样我们只要判断最低位即可
            N/=2;
        }
        return ans;
    }

}
