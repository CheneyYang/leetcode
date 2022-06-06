package leetcode.ciof;

/**
 * 二进制加法
 * Description:
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * 输入: a = "11", b = "10"
 * 输出: "101"
 * <p>
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * <p>
 * 提示：
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * @Author: YangGC
 * DateTime: 06-06
 */
public class q002 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        while (l1 >= 0 || l2 >= 0) {
            int x = l1 < 0 ? 0 : a.charAt(l1) - '0';
            int y = l2 < 0 ? 0 : b.charAt(l2) - '0';
            int sum = x + y + carry;
            res.append(sum % 2);
            carry = sum / 2;
            l1--;
            l2--;

        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
