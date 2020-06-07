package medium;

public class MaxConsecutiveOnesIII {
    public int getMaxOnes(int[] A, int K) {
        int max = 0;
        int current = 0;
        int start = 0;
        int end = 0;
        while (end < A.length) {
            if (A[end] == 1) {
                current++;
                end++;
            } else if (A[end] == 0 && K > 0) {
                K--;
                current++;
                end++;
            } else {
                if (max < current) {
                    max = current;
                }
                while (A[start] == 1) {
                    start++;
                }
                start++;
                end++;
                current = end - start + 1;
            }
        }
        return Math.max(current, max);

    }

}