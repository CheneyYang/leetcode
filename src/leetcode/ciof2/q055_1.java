package leetcode.ciof2;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的深度
 * Description:
 *
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * 例如：
 *
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度3 。
 *
 *
 * 提示：
 *
 * 节点总数 <= 10000
 *
 *
 * @Author: YangGC
 * DateTime: 04-24
 */
public class q055_1 {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int nLeft = maxDepth(root.left);
        int nRight = maxDepth(root.right);
        return nLeft > nRight ? nLeft + 1 : nRight + 1;
    }



    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int x){
            this.val = x;
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

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }


}
