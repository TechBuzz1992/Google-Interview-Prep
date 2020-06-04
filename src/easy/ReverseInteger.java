package easy;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = -62427;

        System.out.println(new ReverseInteger().reverseInteger(n));

    }

    public int reverseInteger(int n) {
        int flag = 1;
        if (n < 0) {
            flag = -1;
            n = n * -1;

        }
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n = n / 10;
        }

        return ans * flag;
    }

}