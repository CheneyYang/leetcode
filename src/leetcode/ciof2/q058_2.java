package leetcode.ciof2;

/**
 * Description:
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出:"cdefgab"
 * 示例 2：
 * <p>
 * 输入: s = "lrloseumgh", k = 6
 * 输出:"umghlrlose"
 *
 * @Author: YangGC
 * DateTime: 04-11
 */
public class q058_2 {

    public static String reverseLeftWords(String s, int n) {
        String res = "";
        for (int i = n; i < s.length(); i++) {
            res += s.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
    }
}
