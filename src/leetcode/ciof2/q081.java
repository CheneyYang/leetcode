package leetcode.ciof2;

import java.util.ArrayList;
import java.util.List;

/**
 * 允许重复选择元素的组合
 * Description:
 * 给定一个无重复元素的正整数数组candidates和一个正整数target，找出candidates中所有可以使数字和为目标数target的唯一组合。
 * <p>
 * candidates中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是不同的。
 * <p>
 * 对于给定的输入，保证和为target 的唯一组合数少于 150 个。
 * <p>
 * <p>
 * <p>
 * 示例1：
 * <p>
 * 输入: candidates = [2,3,6,7], target = 7
 * 输出: [[7],[2,2,3]]
 *
 * @Author: YangGC
 * DateTime: 08-17
 */
public class q081 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candicates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candicates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        //直接跳过
        dfs(candicates, target, ans, combine, idx + 1);
        //选择当前数
        if (target - candicates[idx] >= 0) {
            combine.add(candicates[idx]);
            dfs(candicates, target - candicates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }


    public static void main(String[] args) {

    }
}
