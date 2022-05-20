package leetcode.ciof2;

/**
 * 1～n 整数中 1 出现的次数
 *
 * Description:
 * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 * 示例 1：
 *
 * 输入：n = 12
 * 输出：5
 *
 * 示例 2：
 *
 *  输入：n = 13
 *  输出：6
 *
 * @Author: YangGC
 * DateTime: 05-20
 */
public class q043 {

    public int countDigitOne(int n) {
        int digit = 1;
        int res = 0;
        int high = n/10;
        int current = n%10;
        int low = 0;
        while (high != 0 || current != 0){
            if(current == 0){
                res += high * digit;
            }else if(current == 1){
                res += high * digit + low +1;
            }else{
                res += (high +1)*digit;
            }
            low += current * digit;
            current = high % 10;
            high /=10;
            digit *=10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
    }


}
