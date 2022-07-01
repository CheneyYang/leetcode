package leetcode.ciof;

/**
 * 展平多级双向链表
 * Description:
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 *
 * 给定位于列表第一级的头节点，请扁平化列表，即将这样的多级双向链表展平成普通的双向链表，使所有结点出现在单级双链表中。
 *
 * 输入：head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * 输出：[1,2,3,7,8,11,12,9,10,4,5,6]
 *
 *
 * @Author: YangGC
 * DateTime: 07-01
 */
public class q028 {

    /**
     * 深度优先搜索
     * @param head
     * @return
     */
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    public Node dfs(Node node){
        Node current = node;
        //记录链表的最后一个节点
        Node last = null;

        while (current != null) {
            Node next = current.next;
            //如果有子节点,那么首先处理子节点
            if(current.child != null){
                Node childLast = dfs(current.child);
                next = current.next;
                //将node 与child相连
                current.next = current.child;
                current.child.prev = current;
                //如果next不为空,就将last与next相连
                if(next != null){
                    childLast.next = next;
                    next.prev = childLast;
                }

                //将child置为空
                current.child = null;
                last = childLast;
            }else{
                last = current;
            }
            current = next;
        }
        return last;
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };

    public static void main(String[] args) {

    }

}
