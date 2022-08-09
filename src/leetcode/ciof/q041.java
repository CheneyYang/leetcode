package leetcode.ciof;

import java.util.LinkedList;
import java.util.List;

/**
 * 滑动窗口的平均值
 * Description:
 * 给定一个整数数据流和一个窗口大小，根据该滑动窗口的大小，计算滑动窗口里所有数字的平均值。
 * 实现 MovingAverage 类：
 * <p>
 * MovingAverage(int size) 用窗口大小 size 初始化对象。
 * double next(int val)成员函数 next 每次调用的时候都会往滑动窗口增加一个整数，请计算并返回数据流中最后 size 个值的移动平均值，即滑动窗口里所有数字的平均值。
 *
 * @Author: YangGC
 * DateTime: 07-12
 */
public class q041 {


    List<Integer> list;
    int count = 0;
    int cap = 0;
    int sum = 0;

    /**
     * Initialize your data structure here.
     */
    public q041(int size) {
        list = new LinkedList<>();
        cap = size;
    }

    public double next(int val) {
        if (count < cap) {
            list.add(val);
            sum += val;
            count++;
            return sum * 1.0 / count;
        }
        sum -= list.get(0);
        list.remove(0);
        list.add(val);
        sum += val;
        return sum * 1.0 / count;
    }


    public static void main(String[] args) {

    }
}
