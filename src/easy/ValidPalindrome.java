package easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        // String str = "race a car";
        String str = "A man, a plan, a canal: Panama";

        System.out.println(new ValidPalindrome().isValidPalindrome(str));

    }

    public boolean isValidPalindrome(String str) {
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            while(low<high && !Character.isLetterOrDigit(str.charAt(low))){
                low++;
            }

            while(low<high && !Character.isLetterOrDigit(str.charAt(high))){
                high--;
            }

            if(low<high && Character.toLowerCase(str.charAt(low++)) != Character.toLowerCase(str.charAt(high--))){
                return false;
            }
        }

        return true;
    }

}