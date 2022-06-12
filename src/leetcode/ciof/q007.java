package leetcode.ciof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组中和为 0 的三个数
 * Description:
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a ，b ，c ，使得 a + b + c = 0 ？请找出所有和为 0 且 不重复 的三元组。
 *
 * 示例 1：
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 *
 * @Author: YangGC
 * @Date: 06-12
 */
public class q007 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        //枚举a
        for (int first = 0; first < n; ++first) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            //c 对应的指针初始指向数组最右端
            int thrid = n - 1;
            int target = -nums[first];
            //枚举b
            for (int second = first + 1; second < n; ++second) {
                //需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                //需要保证b的指针在c的指针左侧
                while (second < thrid && nums[second] + nums[thrid] > target) {
                    --thrid;
                }
                //如果指针重合，随着b后续的增加
                //就不会有满足 a+b+c = 0并且b<c 的c了,可以退出循环
                if(second == thrid){
                    break;
                }
                if(nums[second]+nums[thrid] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[thrid]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
