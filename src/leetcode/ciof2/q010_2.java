package leetcode.ciof2;

/**
 * 青蛙跳台
 */
public class q010_2 {
    public int numWays(int n) {
        int i0 = 1,i1 = 1,i2 = 2, sum = 0;
        if(n < 2){
            return 1;
        }
        for(int i = 2;i <= n;i++){
            sum = (i0 + i1) % 1000000007;
            i0 = i1;
            i1 = sum;
        }
        return sum;
    }
}
