package leetcode.ciof2;

/**
 * Description:
 * 请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。
 *
 * 示例 1:
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 *
 * 示例 2:
 * 输入:
 * s = "aa"
 * p = "a*"
 * 输出: true
 * 解释:因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 *
 * 示例 3:
 * 输入:
 * s = "ab"
 * p = ".*"
 * 输出: true
 * 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 *
 * 示例 4:
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释:因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 *
 *
 *
 * @Author: YangGC
 * DateTime: 06-05
 */
public class q019 {

    public boolean isMatch(String A, String B) {
        //如果字符串长度为0,需要检测下正则串
        if (A.length() == 0) {
            //如果正则串长度为奇数,必定不匹配, 比如“.”"ab*"必须是a*b*这种形式,*在奇数位上
            if (B.length() % 2 != 0) {
                return false;
            }
            int i = 1;
            while (i < B.length()) {
                if (B.charAt(i) != '*') {
                    return false;
                }
                i += 2;
            }
            return true;
        }
        //如果字符串长度为0,但是正则串没了,return false
        if(B.length() == 0){
            return false;
        }
        //C1和C2分别是两个串的当前位,C3是正则串当前位的后一位,如果存在的话,就更新一下
        char c1 = A.charAt(0);
        char c2 = B.charAt(0);
        char c3 = 'a';
        if (B.length() > 1) {
            c3 = B.charAt(1);
        }
        //和dp一样，后一位分别是‘*’和不是'*'两种情况
        if(c3 != '*'){
            if(c1 == c2 || c2 == '.'){
                return isMatch(A.substring(1),B.substring(1));
            }else{
            //否则不匹配
                return false;
            }
        } else {
            //如果该位字符串一样,或是正则串该位是‘.’,和dp一样,有看和不看两种情况
            if(c1 == c2 || c2 == '.'){
                return isMatch(A.substring(1),B) || isMatch(A,B.substring(2));
            }else{
                //不一样,那么正则串这两位就忽略,直接往后走
                return isMatch(A,B.substring(2));
            }
        }
    }
}
