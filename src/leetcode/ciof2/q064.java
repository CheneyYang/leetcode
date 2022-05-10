package leetcode.ciof2;

/**
 * 求1+2+…+n
 * Description:
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * <p>
 * 示例 1：
 * 输入: n = 3
 * 输出: 6
 * <p>
 * 示例 2：
 * 输入: n = 9
 * 输出: 45
 *
 * @Author: YangGC
 * DateTime: 05-10
 */
public class q064 {

    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }


    public static void main(String[] args) {

    }
}
