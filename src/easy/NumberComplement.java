package easy;

public class NumberComplement {
    public static void main(String[] args) {

    }

    public int getComplement(int n) {
        int result = 0;
        int power = 1;
        while (n > 0) {
            result += (n % 2 ^ 1) * power;
            power <<= 1;
            n>>=1;
        }

        return result;

    }

}