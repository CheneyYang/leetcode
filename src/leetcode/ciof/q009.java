package leetcode.ciof;

/**
 * 乘积小于 K 的子数组
 * Description:
 * 给定一个正整数数组 nums和整数 k ，请找出该数组内乘积小于 k 的连续的子数组的个数。
 * 示例 1:
 * 输入: nums = [10,5,2,6], k = 100
 * 输出: 8
 * 解释: 8 个乘积小于 100 的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]。
 * 需要注意的是 [10,5,2] 并不是乘积小于100的子数组。
 *
 * @Author: YangGC
 * @Date: 06-14
 */
public class q009 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int ret = 0;
        int prod = 1;
        int i = 0;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i];
                i++;
            }
            ret += j - i + 1;
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
