package leetcode.ciof2;

/**
 * 删除链表的节点
 * Description:
 *
 *  给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 *
 * 注意：此题对比原题有改动
 *
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 示例 2:
 *
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 *
 *
 * @Author: YangGC
 * DateTime: 04-14
 */
public class q018 {
    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }
        return head;
    }


    public static void main(String[] args) {
        System.out.println("...");
    }

    private class ListNode {
        Integer val;
        ListNode next;

        public Integer getVar() {
            return val;
        }

        public void setVar(Integer val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
