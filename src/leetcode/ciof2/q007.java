package leetcode.ciof2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * 重建二叉树
 * Description:
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 *
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *
 * 示例 1:
 *
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * 示例 2:
 *
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 *
 * 限制：
 *
 * 0 <= 节点个数 <= 5000
 *
 * @Author: YangGC
 * DateTime: 04-28
 */
public class q007 {

    int[] preorder;
    Map<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }
        TreeNode recur(int root, int left,int right){
            if (left > right) {
                return null;
            }
            TreeNode node = new TreeNode(preorder[root]);
            Integer i = dic.get(preorder[root]);
            node.left = recur(root+1,left,i-1);
            node.right = recur(root+i-left+1,i+1,right);
            return node;
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
    }
}
