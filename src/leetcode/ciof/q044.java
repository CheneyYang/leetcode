package leetcode.ciof;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树每层的最大值
 * Description:
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 * 示例1：
 * 输入: root = [1,3,2,5,3,null,9]
 * 输出: [1,3,9]
 * 解释:
 * 1
 * / \
 * 3   2
 * / \   \
 * 5   3   9
 *
 * @Author: YangGC
 * DateTime: 07-15
 */
public class q044 {

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        dfs(res, root, 0);
        return res;
    }


    public void dfs(List<Integer> res, TreeNode root, int currHeight) {
        if (currHeight == res.size()) {
            res.add(root.val);
        } else {
            res.set(currHeight, Math.max(res.get(currHeight), root.val));
        }

        if (root.left != null) {
            dfs(res, root.left, currHeight + 1);
        }
        if (root.right != null) {
            dfs(res, root.right, currHeight + 1);
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }


    public static void main(String[] args) {

    }

}
