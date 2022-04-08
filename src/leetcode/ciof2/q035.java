package leetcode.ciof2;

/**
 * 示例 1:
 *
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 *
 */


public class q035 {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (i == (nums.length - 1)) {
                return (nums[i] < target) ? nums.length : (nums.length - 1);
            }
            if (nums[i] >= target) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] ints = {0};
        System.out.println(searchInsert(ints, 2));
    }
}
