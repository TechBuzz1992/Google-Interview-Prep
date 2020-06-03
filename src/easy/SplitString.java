package easy;

public class SplitString {
    public static void main(String[] args) {
        String str = "RLLLLRRRLR";
        SplitString obj = new SplitString();
        System.out.println(obj.maxSplitForBalance(str));

    }

    public int maxSplitForBalance(String str) {
        int start = 0;
        int end = 1;
        int count = 0;
        while (start < end && end < str.length()) {
            if (isBalanced(str.substring(start, end + 1))) {
                start = end+1;
                end+=2;
                count++;
            } else {
                end++;
            }

        }

        return count;

    }

    public boolean isBalanced(String str) {
        int R = 0;
        int L = 0;
        for (char c : str.toCharArray()) {
            if (c == 'R') {
                R++;
            } else {
                L++;
            }
        }

        return R == L;
    }

}