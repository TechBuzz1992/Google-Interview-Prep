package easy;

public class BinaryNumberWithAltBits {
    public static void main(String[] args) {

    }

    public boolean hasAltBits(int n) {
        int last = n % 2;
        n >>= 1;
        while (n > 0) {
            int current = n % 2;
            if (current == last) {
                return false;
            }
            last = current;
            n >>= 1;

        }

        return true;
    }

}