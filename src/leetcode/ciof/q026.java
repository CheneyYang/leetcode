package leetcode.ciof;

/**
 * 重排链表
 * Description:
 * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 * L0→ L1→ … → Ln-1→ Ln
 * 请将其重新排列后变为：
 * L0→Ln→L1→Ln-1→L2→Ln-2→
 * <p>
 * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例 1:
 * 输入: head = [1,2,3,4]
 * 输出: [1,4,2,3]
 * <p>
 * 示例 2:
 * 输入: head = [1,2,3,4,5]
 * 输出: [1,5,2,4,3]
 * <p>
 * 解释: 链表对半拆分,后半段进行反转,然后与前半段进行合并
 *
 * @Author: YangGC
 * @Date: 06-29
 */
public class q026 {

    public void reorderList(ListNode head) {
        ListNode pre = new ListNode();
        ListNode slow = pre;
        ListNode fast = pre;
        pre.next = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode half = slow.next;
        slow.next = null;
        ListNode rev_half = this.reverseList(half);
        ListNode curr = pre.next;
        while (rev_half != null){
            ListNode tmp = curr.next;
            curr.next = rev_half;
            curr = curr.next;
            rev_half = rev_half.next;
            curr.next = tmp;
            curr = curr.next;
        }

    }

    //反转链表
    private ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
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

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {

    }

}
