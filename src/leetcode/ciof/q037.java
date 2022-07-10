package leetcode.ciof;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 小行星碰撞
 * Description:
 * 给定一个整数数组 asteroids，表示在同一行的小行星。
 * 对于数组中的每一个元素，其绝对值表示小行星的大小，正负表示小行星的移动方向（正表示向右移动，负表示向左移动）。每一颗小行星以相同的速度移动。
 * 找出碰撞后剩下的所有小行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。
 * <p>
 * 示例 1：
 * 输入：asteroids = [5,10,-5]
 * 输出：[5,10]
 * 解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。
 *
 * @Author: YangGC
 * DateTime: 07-10
 */
public class q037 {

    //Stack性能差 官方废弃了；所以使用Deque来代替 速度能提升好几倍
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new LinkedList<>();
        int p = 0;
        while (p < asteroids.length) {
            if (stack.isEmpty() || stack.peek() < 0 || asteroids[p] > 0) {
                stack.push(asteroids[p]);
            }else if(stack.peek() <= -asteroids[p]){
                if(stack.pop() < -asteroids[p]){
                    continue;
                }
            }
            p++;
        }

        int[] arr = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    public static void main(String[] args) {

    }


}
