package leetcode.ciof2;

/**
 * Description:
 * 输入两个链表，找出它们的第一个公共节点。
 * @Author: YangGC
 * DateTime: 04-18
 */
public class q052 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }





    public static void main(String[] args) {

    }

    private class ListNode {
        Integer val;
        ListNode next;

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
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
