package leetcode.ciof2;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长不含重复字符的子字符串
 * Description:
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * <p>
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * @Author: YangGC
 * DateTime: 05-26
 */
public class q048 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0;
        int tmp = 0;
        for (int j = 0; j < s.length(); j++) {
            //获取索引i
            int i = dic.getOrDefault(s.charAt(j), -1);
            //更新哈希表
            dic.put(s.charAt(j), j);
            tmp = (tmp < (j -i) ) ? tmp + 1: j - i;
            res = Math.max(res,tmp);
        }
        return res;
    }

}
