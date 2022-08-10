package leetcode.ciof;

/**
 * 求平方根
 * Description:
 * 给定一个非负整数 x ，计算并返回 x 的平方根，即实现int sqrt(int x)函数。
 * <p>
 * 正数的平方根有两个，只输出其中的正数平方根。
 * <p>
 * 如果平方根不是整数，输出只保留整数的部分，小数部分将被舍去。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: x = 4
 * 输出: 2
 *
 * @Author: YangGC
 * DateTime: 08-10
 */
public class q072 {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }

    public static void main(String[] args) {

    }

}
