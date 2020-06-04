package easy;

public class FlippingAnImage {
    public static void main(String[] args) {

    }

    public int[][] flipImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int j = 0;
            int k = A[i].length - 1;
            while (j < k) {
                int temp = A[i][j];
                A[i][j++] = A[i][k];
                A[i][k--] = temp;
            }

            for (j = 0; j < A[i].length; i++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;

            }
        }

        return A;
    }

}