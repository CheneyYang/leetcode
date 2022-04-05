package leetcode.ciof2;

import java.util.Arrays;

public class q040 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] vec = new int[k];

        Arrays.sort(arr);

        for (int i = 0; i < k; ++i) {

            vec[i] = arr[i];

        }

        return vec;
    }
}
