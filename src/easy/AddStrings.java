package easy;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "923";
        String num2 = "34";

        AddStrings obj = new AddStrings();
        System.out.println(obj.addStrings(num1, num2));

    }

    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int x = Integer.parseInt(num1.substring(i, i + 1));
            int y = Integer.parseInt(num2.substring(j, j + 1));
            ans.append((x + y + carry) % 10 + "");
            carry = (x + y) / 10;
            i--;
            j--;
        }

        while (i >= 0) {
            int x = Integer.parseInt(num1.substring(i, i + 1));
            ans.append((x + carry) % 10 + "");
            carry = (x + carry) / 10;
            i--;
        }

        while (j >= 0) {
            int x = Integer.parseInt(num1.substring(j, j + 1));
            ans.append((x + carry) % 10 + "");
            carry = (x + carry) / 10;
            j--;
        }

        if (carry > 0) {
            ans.append(carry + "");
        }

        return ans.reverse().toString();

    }

}