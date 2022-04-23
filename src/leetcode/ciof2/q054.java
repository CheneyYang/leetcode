package leetcode.ciof2;

/**
 *
 *  二叉搜索树的第k大节点
 * Description:
 *
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *   2
 * 输出: 4
 * 示例 2:
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 4
 *
 *
 * 限制：
 *
 * 1 ≤ k ≤ 二叉搜索树元素个数
 *
 * @Author: YangGC
 * DateTime: 04-22
 */
public class q054 {

    int res;
    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }


    void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.right);
        if(k == 0){
            return;
        }
        if(-k == 0){
            res = root.val;
        }
        dfs(root.left);
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
        System.out.println("..............");
    }



}
