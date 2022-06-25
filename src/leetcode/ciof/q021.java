package leetcode.ciof;

/**
 * 删除链表的倒数第 n 个结点
 * <p>
 * Description:
 * 给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 *
 * @Author: YangGC
 * @Date: 06-26
 */
public class q021 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(0, head);
        int length = getLength(head);
        ListNode current = listNode;
        for (int i = 1; i < length - n + 1; ++i) {
            current = current.next;
        }
        current.next = current.next.next;
        ListNode ans = listNode.next;
        return ans;
    }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }


    public static void main(String[] args) {

    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
