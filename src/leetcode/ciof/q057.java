package leetcode.ciof;

import java.util.TreeSet;

/**
 * 值和下标之差都在给定的范围内
 *
 * Description:
 * 给你一个整数数组 nums 和两个整数k 和 t 。请你判断是否存在 两个不同下标 i 和 j，使得abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
 * 如果存在则返回 true，不存在返回 false。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,1], k = 3, t = 0
 * 输出：true
 *
 *
 * @Author: YangGC
 * DateTime: 07-26
 */
public class q057 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if(ceiling != null && ceiling<=(long)nums[i]+(long)t){
                return true;
            }
            set.add((long)nums[i]);
            if(i>=k){
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
