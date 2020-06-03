package easy;

import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {

    }

    public int assignCookies(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sum = 0;
        int i = g.length - 1;
        int j = s.length - 1;
        while (i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                sum++;
                i--;
                j--;
            } else {
                i--;
            }
        }

        return sum;

    }

}