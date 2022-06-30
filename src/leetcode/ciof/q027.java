package leetcode.ciof;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 回文链表
 * Description:
 * 给定一个链表的 头节点 head ，请判断其是否为回文链表。
 * 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
 * 输入: head = [1,2,3,3,2,1]
 * 输出: true
 *
 * @Author: YangGC
 * DateTime: 07-01
 */
public class q027 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        //将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }
        //使用双指针判断是否回文
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
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


    public static void main(String[] args) {

    }

}
