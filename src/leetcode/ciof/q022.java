package leetcode.ciof;

import java.util.HashSet;
import java.util.Set;

/**
 * 链表中环的入口节点
 * <p>
 * Description:
 * 链表中是否有环,如果有返回环入口的节点,如果没有则返回null
 * <p>
 * 给定一个链表，返回链表开始入环的第一个节点。 从链表的头节点开始沿着 next 指针进入环的第一个节点为环的入口节点。如果链表无环，则返回null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 * 说明：不允许修改给定的链表。
 *
 * @Author: YangGC
 * @Date: 06-27
 */
public class q022 {


    //侦察链表成环, 遍历链表每个元素,把指针的下标存入List,如果出现下标有重复,则表示有环
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }



    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
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
