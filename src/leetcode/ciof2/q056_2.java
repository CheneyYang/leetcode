package leetcode.ciof2;

/**
 * 数组中数字出现的次数 II
 * Description:
 *
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 * 示例 1：
 * 输入：nums = [3,4,3,3]
 * 输出：4
 * 例 2：
 * 输入：nums = [9,1,7,9,7,9,7]
 * 输出：1
 *
 * @Author: YangGC
 * DateTime: 05-09
 */
public class q056_2 {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int num : nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }

    public static void main(String[] args) {
        System.out.println("......");
    }
}
