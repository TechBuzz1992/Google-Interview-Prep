package easy;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String str = "abca";
        ValidPalindromeII obj = new ValidPalindromeII();

        System.out.println(obj.isValidPalindrome(str));

    }

    public boolean isValidPalindrome(String str) {
        char[] arr = str.toCharArray();
        int low = 0;
        int high = str.length() - 1;
        int count = 0;
        while (low < high) {
            if (arr[low] == arr[high]) {
                low++;
                high--;
            } else {
                if (count > 1) {
                    return false;
                } else {
                    high--;
                    count++;
                }
            }

        }

        return count <= 1;

    }

}