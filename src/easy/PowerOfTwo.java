package easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(new PowerOfTwo().isPowerOfTwo(16));
        System.out.println(new PowerOfTwo().isPowerOfTwo(14));

    }

    public boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i = i * 2;
        }

        return i == n;

    }

}