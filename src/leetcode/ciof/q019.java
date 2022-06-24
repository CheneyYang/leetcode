package leetcode.ciof;

/**
 *  最多删除一个字符得到回文
 *
 * Description:
 * 给定一个非空字符串 s，请判断如果 最多 从字符串中删除一个字符能否得到一个回文字符串。
 * 示例 1:
 * 输入: s = "aba"
 * 输出: true
 *
 * @Author: YangGC
 * @Date: 06-24
 */
public class q019 {

    /**
     * 双指针解法
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() -1;
        while (low < high) {
            char c1 = s.charAt(low);
            char c2 = s.charAt(high);
            if (c1 == c2) {
                ++low;
                --high;
            }else{
                return validPalindrome(s, low, high - 1) || validPalindrome(s, low + 1, high);
            }

        }
        return true;
    }

    public boolean validPalindrome(String s, int low, int high) {
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {

    }
}
