package leetcode.ciof;

import java.util.LinkedList;

/**
 * 往完全二叉树添加节点
 * Description:
 * 完全二叉树是每一层（除最后一层外）都是完全填充（即，节点数达到最大，第 n 层有 2n-1个节点）的，并且所有的节点都尽可能地集中在左侧。
 * <p>
 * 设计一个用完全二叉树初始化的数据结构CBTInserter，它支持以下几种操作：
 * <p>
 * CBTInserter(TreeNode root)使用根节点为root的给定树初始化该数据结构；
 * CBTInserter.insert(int v) 向树中插入一个新节点，节点类型为 TreeNode，值为 v 。使树保持完全二叉树的状态，并返回插入的新节点的父节点的值；
 * CBTInserter.get_root() 将返回树的根节点。
 *
 * @Author: YangGC
 * DateTime: 07-14
 */
public class q043 {

    TreeNode root;
    LinkedList<TreeNode> queue;

    public q043(TreeNode root) {
        this.root = root;
        queue = new LinkedList<>();
    }
    //如果当前结点的左结点为空或者右结点为空,就将新结点接上,并返回当前结点的值
    //否则将当前结点的左右结点依次入队列,继续while循环
    public int insert(int v) {
        TreeNode newNode = new TreeNode(v);
        if (queue.isEmpty()) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null) {
                node.left = newNode;
                queue.addFirst(node);
            } else if (node.right == null) {
                node.right = newNode;
                queue.addFirst(node);
            } else {
                queue.add(node.left);
                queue.add(node.right);
                continue;
            }
            return node.val;
        }
        return -1;
    }

    public TreeNode get_root() {
        return root;
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
