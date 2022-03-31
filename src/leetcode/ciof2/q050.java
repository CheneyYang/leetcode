package leetcode.ciof2;

import java.util.HashMap;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 示例 1:
 *
 * 输入：s = "abaccdeff"
 * 输出：'b'
 * 示例 2:
 *
 * 输入：s = ""
 * 输出：' '
 * 限制：
 *
 * 0 <= s 的长度 <= 50000
 */
public class q050 {
    public static char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character,Boolean> dic = new HashMap<>();
        for (char aChar : chars) {
            dic.put(aChar,!dic.containsKey(aChar));
        }
        for (char aChar : chars) {
            if(dic.get(aChar)){
                return aChar;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {

    }

}
