package leetcode.ciof;

import java.util.*;

/**
 * 二叉树的右侧视图
 * Description:
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * <p>
 * 示例 1:
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1,3,4]
 *
 * @Author: YangGC
 * DateTime: 07-17
 */
public class q046 {

    private List<Integer> ans = new LinkedList<>();
    private int depth;
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root);
        return ans;
    }
    private void traverse(TreeNode root) {
        if (root == null) return;
        depth++;
        //记录最右节点值
        if (depth > ans.size()) ans.add(root.val);
        //先右子树、后左子树
        traverse(root.right);
        traverse(root.left);
        depth--;
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


}
