package leetcode.ciof2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 没有重复元素集合的全排列
 * Description:
 * 给定一个不含重复数字的整数数组 nums ，返回其 所有可能的全排列 。可以 按任意顺序 返回答案。
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * @Author: YangGC
 * DateTime: 08-19
 */
public class q083 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack(n,output,res,0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        //所有数据都填完
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
        //动态维护数组
            Collections.swap(output, first, i);
            //继续递归填写下一个参数
            backtrack(n, output, res, first + 1);
            //撤销操作
            Collections.swap(output,first,i);
        }
    }

}
