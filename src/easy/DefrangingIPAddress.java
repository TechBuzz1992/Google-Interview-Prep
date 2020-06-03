package easy;

public class DefrangingIPAddress {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        DefrangingIPAddress obj = new DefrangingIPAddress();

        System.out.println(obj.defrangIPAdress(str));

    }

    public String defrangIPAdress(String ipAddr) {
        StringBuilder ans = new StringBuilder();
        for (char c : ipAddr.toCharArray()) {
            if (c == '.') {
                ans.append("[.]");
            } else {
                ans.append(c + "");
            }

        }

        return ans.toString();
    }

}