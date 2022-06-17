package leetcode.ciof;

import java.util.HashMap;
import java.util.Map;

/**
 * 0 和 1 个数相同的子数组
 * Description:
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 *
 * 示例 1：
 * 输入: nums = [0,1]
 * 输出: 2
 * 说明: [0, 1] 是具有相同数量 0 和 1 的最长连续子数组。
 *
 * 示例 2：
 * 输入: nums = [0,1,0]
 * 输出: 2
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量 0 和 1 的最长连续子数组。
 *
 *
 * @Author: YangGC
 * @Date: 06-17
 */
public class q011 {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Integer counter = 0;
        map.put(counter,-1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if(num == 1){
                counter++;
            }else{
                counter --;
            }
            if(map.containsKey(counter)){
                int privIndex = map.get(counter);
                maxLength = Math.max(maxLength,i - privIndex);
            }else{
                map.put(counter,i);
            }

        }
        return maxLength;
    }
}
