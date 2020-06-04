package easy;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 20;

        System.out.println(new FirstBadVersion().firstBadVersion(n));

    }

    public boolean isBadVersion(int n) {
        return n >= 9;
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (!isBadVersion(mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

}