package com.yanggc.swd4offer;//找出数组中重复的数字。
//
// 
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
// Related Topics 数组 哈希表 
// 👍 454 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution03 {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> tempMap = new HashMap<>(nums.length -1);
        for(int currNum : nums){
            Integer integer = tempMap.get(currNum);
            if(integer != null && integer >= 1){
                return currNum;
            }
            tempMap.put(currNum,1);
        }
        return -1;
    }
}

class Test{
    public static void main(String[] args) {
        int[] testNums = {2, 3, 1, 0, 3, 5, 2};
        Solution03 solution = new Solution03();
        int repeatNumber = solution.findRepeatNumber(testNums);
        System.out.println(repeatNumber);
    }
}



//leetcode submit region end(Prohibit modification and deletion)
