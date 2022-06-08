package leetcode.ciof;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数除法
 *
 * Description:
 * 给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%' 。
 * 注意：
 * <p>
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8以及truncate(-2.7335) = -2
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,231−1]。本题中，如果除法结果溢出，则返回 231− 1
 * <p>
 * 示例 1：
 * 输入：a = 15, b = 2
 * 输出：7
 * 解释：15/2 = truncate(7.5) = 7
 * <p>
 * 示例 2：
 * 输入：a = 7, b = -3
 * 输出：-2
 * 解释：7/-3 = truncate(-2.33333..) = -2
 *
 * @Author: YangGC
 * DateTime: 06-08
 */
public class q001 {
    public int divide(int a, int b) {
        if (a == Integer.MIN_VALUE) {
            if (b == 1) {
                return Integer.MIN_VALUE;
            }
            if (b == -1) {
                return Integer.MAX_VALUE;
            }
        }

        //考虑除数为最小值的情况
        if (b == Integer.MIN_VALUE) {
            return a == Integer.MIN_VALUE ? 1 : 0;
        }
        //考虑除数为0的情况
        if (a == 0) {
            return 0;
        }
        //考虑被除数为0的情况
        if (a == 0) {
            return 0;
        }
        //一般情况 使用类二分查找
        boolean rev = false;
        if (a > 0) {
            a = -a;
            rev = !rev;
        }
        if (b > 0) {
            b = -b;
            rev = !rev;
        }
        List<Integer> candidates = new ArrayList<>();
        candidates.add(b);
        int index = 0;
        while (candidates.get(index) >= a - candidates.get(index)) {
            candidates.add(candidates.get(index) + candidates.get(index));
            ++index;
        }
        int ans = 0;
        for (int i = candidates.size() - 1; i >= 0; --i) {
            if (candidates.get(i) >= a) {
                ans += 1 << i;
                a -= candidates.get(i);
            }
        }
        return rev ? -ans : ans;
    }
}
