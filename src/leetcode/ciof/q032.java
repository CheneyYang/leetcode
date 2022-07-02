package leetcode.ciof;

import java.util.Arrays;

/**
 * 有效的变位词
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断它们是不是一组变位词（字母异位词）。
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 */

public class q032 {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() || t.equals(s)){
            return false;
        }
        char[] str1 =  s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }

    public static void main(String[] args) {

    }

}
