package leetcode.ciof2;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * <p>
 * <p>
 * 示例1:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: True
 * <p>
 * <p>
 * 示例2:
 * <p>
 * 输入: [0,0,1,2,5]
 * 输出: True
 *
 * @Author: YangGC
 * DateTime: 04-12
 */
public class q061 {


    public static boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0;
        int min = 14;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if(repeat.contains(num)){
                return false;
            }
            max = Math.max(max, num);
            min = Math.min(min, num);
            repeat.add(num);
        }
        return max - min < 5;
    }


    public static void main(String[] args) {
        System.out.println("....");
    }

}
