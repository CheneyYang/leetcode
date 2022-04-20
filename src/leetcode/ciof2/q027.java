package leetcode.ciof2;


/**
 * 二叉树的镜像
 * Description:
 * 
 *请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *
 *    4
 *  /  \
 *  2   7
 * / \  / \
 * 1  3 6  9
 * 镜像输出：
 *
 *   4
 *  /  \
 *  7   2
 * / \  / \
 * 9  6 3 1
 *
 * 
 *
 * 示例 1：
 *
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 * 
 *
 * 限制：
 *
 * 0 <= 节点个数 <= 1000
 *
 * @Author: YangGC
 * DateTime: 04-20
 */
public class q027 {

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){ return null; }
        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            val = x;
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
        System.out.println("..........");
    }

}
