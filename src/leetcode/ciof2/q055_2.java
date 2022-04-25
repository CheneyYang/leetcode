package leetcode.ciof2;


/**
 * 平衡二叉树
 * Description:
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回false 。
 *
 *
 * 限制：
 * 0 <= 树的结点个数 <= 10000
 *
 *
 * @Author: YangGC
 * DateTime: 04-25
 */
public class q055_2 {

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }else{
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }


    public int height(TreeNode root){
        if(root == null){
           return 0;
        }else{
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    public static void main(String[] args) {

    }

    private class TreeNode {

        TreeNode left;
        TreeNode right;
        int val;

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

        TreeNode(int x){
            this.val = x;
        }

    }
}
