package easy;

//import java.util.*;

public class AddBinary {
    public static void main(String[] args) {

    }

    public String addBinary(String s, String t) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        int j = t.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += s.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += t.charAt(j--) - '0';
            }

            ans.insert(0, sum % 2);
            carry = sum / 2;

        }

        if (carry > 0) {
            ans.insert(0, 1);
        }

        return ans.toString();

    }

}