package easy;

import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,8,9,9,9,9,9,9,9,9};

        System.out.println(Arrays.toString(new PlusOne().plusOne(num)));

    }

    public int[] plusOne(int[] num) {
        for (int i = num.length - 1; i > 0; i--) {
            if (num[i] < 9) {
                num[i]++;
                return num;
            }
            num[i] = 0;
        }

        int[] ans = new int[num.length + 1];
        ans[0] = 1;

        return ans;
    }

}