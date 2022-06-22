package leetcode.ciof;

/**
 * 有效的回文
 * Description:
 * 给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。
 * 本题中，将空字符串定义为有效的 回文串 。
 *
 * @Author: YangGC
 * @Date: 06-22
 */
public class q018 {

    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            //判断字符是不是字母或数字
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgoodReverse = new StringBuffer(sgood).reverse();
        return sgoodReverse.toString().equals(sgood.toString());
    }

    public static void main(String[] args) {

    }
}
