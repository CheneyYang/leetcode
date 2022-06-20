package leetcode.ciof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 字符串中的所有变位词
 * Description:
 * 给定两个字符串s和p，找到s中所有 p 的变位词的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 变位词 指字母相同，但排列不同的字符串。
 *
 * 示例 1：
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的变位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的变位词。
 *
 * 解析: 滑动窗口问题
 *
 * @Author: YangGC
 * @Date: 06-21
 */
public class q015 {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        if(sLen < pLen){
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i)-'a'];
            ++pCount[p.charAt(i)-'a'];
        }
        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }
        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i)-'a'];
            ++sCount[s.charAt(i+pLen) -'a'];
            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }

        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
