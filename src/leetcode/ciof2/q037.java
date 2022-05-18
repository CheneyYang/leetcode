package leetcode.ciof2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 序列化二叉树
 * Description:
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 * <p>
 * 你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * <p>
 * 提示：输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 * <p>
 * 输入：root = [1,2,3,null,null,4,5]
 * 输出：[1,2,3,null,null,4,5]
 *
 * @Author: YangGC
 * DateTime: 05-13
 */
public class q037 {


    // 序列化
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode != null) {
                res.append(currentNode.val + ",");
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            } else {
                res.append("null,");
            }
        }
        //删除最后一个元素 “,”或者“]”
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // 反序列化
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }
        String[] values = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (!values[i].equals("null")) {
                currNode.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(currNode.left);
            }
            i++;
            if (!values[i].equals("null")) {
                currNode.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    private class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }

        public TreeNode(int x, TreeNode left, TreeNode right) {
            val = x;
            left = left;
            right = right;
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
