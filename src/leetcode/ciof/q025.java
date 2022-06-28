package leetcode.ciof;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 链表中的两数相加
 * Description:
 * 给定两个 非空链表 l1和 l2 来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * <p>
 * 可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 输入：l1 = [7,2,4,3], l2 = [5,6,4]
 * 输出：[7,8,0,7]
 * <p>
 * 按尾部对齐,每个元素的值进行相加得出的结果组成新的链表
 *
 * @Author: YangGC
 * @Date: 06-29
 */
public class q025 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        //将l1和l2全部都装到栈里面
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode ans = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int a = stack1.isEmpty() ? 0 : stack1.pop();
            int b = stack2.isEmpty() ? 0 : stack2.pop();

            int curr = a + b + carry;
            //搬运工:表示相加10位数要进的位数
            carry = curr / 10;
            //当前的位数(取余的个位数)
            curr %= 10;
            ListNode currNode = new ListNode(curr);

            //把上一个的结果节点,移动到下一位,并对当前位置进行赋值
            currNode.next = ans;
            ans = currNode;
        }
        return ans;
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
