package leetcode.ciof;

import java.util.HashMap;
import java.util.Map;

/**
 * 单词长度的最大乘积
 * <p>
 * Description:
 * 给定一个字符串数组words，请计算当两个字符串 words[i] 和 words[j] 不包含相同字符时，它们长度的乘积的最大值。
 * 假设字符串中只包含英语的小写字母。如果没有不包含相同字符的一对字符串，返回 0。
 * <p>
 * 示例 1:
 * 输入: words = ["abcw","baz","foo","bar","fxyz","abcdef"]
 * 输出: 16
 * 解释: 这两个单词为 "abcw", "fxyz"。它们不包含相同字符，且长度的乘积最大。
 * 示例 2:
 * 输入: words = ["a","ab","abc","d","cd","bcd","abcd"]
 * 输出: 4
 * 解释: 这两个单词为 "ab", "cd"。
 *
 * @Author: YangGC
 * @Date: 06-10
 */
public class q005 {
    public int maxProduct(String[] words) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            int bitMask = 0;
            for (char c : words[i].toCharArray()) {
                bitMask |= (1 << (c - 'a'));
            }
            map.put(bitMask, Math.max(map.getOrDefault(bitMask, 0), words[i].length()));
        }
        int ans = 0;
        for (int x : map.keySet()) {
            for (int y : map.keySet()) {
                if ((x & y) == 0) {
                    ans = Math.max(ans, map.get(x) * map.get(y));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
