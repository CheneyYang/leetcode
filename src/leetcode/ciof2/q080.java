package leetcode.ciof2;

import java.util.ArrayList;
import java.util.List;

/**
 * 含有 k 个元素的组合
 * Description:
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例 1:
 * 输入:n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 *
 * @Author: YangGC
 * DateTime: 08-16
 */
public class q080 {

    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k);
        return ans;
    }


    public void dfs(int cur, int n, int k) {
        //剪枝： temp 长度加上区间[cur,n]的长度小于k, 不可能构造出k的temp
        if (temp.size() + (n - cur + 1) < k) {
            return;
        }
        //记录满足的答案
        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        //考虑选择当前位置
        temp.add(cur);
        dfs(cur+1,n,k);
        temp.remove(temp.size() - 1);
        //考虑不选择当前位置
        dfs(cur + 1, n, k);
    }

    public static void main(String[] args) {

    }

}
