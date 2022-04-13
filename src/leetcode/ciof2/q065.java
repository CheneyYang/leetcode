package leetcode.ciof2;

/**
 * 不用加减乘除做加法
 * <p>
 * Description:
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 * <p>
 * 示例:
 * <p>
 * 输入: a = 1, b = 1
 * 输出: 2
 * <p>
 * 提示：
 * a,b均可能是负数或 0
 * 结果不会溢出 32 位整数
 *
 *
 * @Author: YangGC
 * DateTime: 04-13
 */
public class q065 {
    public static int add(int a, int b) {
        // 当进位为 0 时跳出
        while (b != 0) {
            // c = 进位
            int c = (a & b) << 1;
            // a = 非进位和
            a ^= b;
            // b = 进位
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(1,99));
    }
}
