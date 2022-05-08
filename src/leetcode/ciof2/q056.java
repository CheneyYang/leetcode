package leetcode.ciof2;

/**
 * 数组中数字出现的次数
 * Description:
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * <p>
 * 示例 1
 * 输入：nums = [4,1,4,6]
 * 输出：[1,6] 或 [6,1]
 * <p>
 * 示例 2：
 * 输入：nums = [1,2,10,4,1,4,3,3]
 * 输出：[2,10] 或 [10,2]
 *
 * @Author: YangGC
 * DateTime: 05-08
 */
public class q056 {
    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        int h = 1;
        while ((h & sum) == 0) {
            h <<= 1;
        }
        //分组
        int group1 = 0;
        int group2 = 0;
        for (int num : nums) {
            if ((num & h) == 0) {
                group1 ^= num;
            } else {
                group2 ^= num;
            }
        }
        return new int[]{group1, group2};
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 10, 4, 1, 4, 3, 3};
        int x = 0;
        for (int array : arrays) {
            x ^= array;
            System.out.println(x);
        }
    }
}
