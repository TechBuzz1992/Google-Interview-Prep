package easy;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String str = "hgs-f-378-sjhbshj";
        int k = 4;

        System.out.println(new LicenseKeyFormatting().getValidLicenseKey(str, k));

    }

    public String getValidLicenseKey(String str, int k) {
        StringBuilder ans = new StringBuilder();
        int high = str.length() - 1;
        int count = 0;
        while (high >= 0) {
            if (Character.isLetter(str.charAt(high))) {
                ans.insert(0, Character.toUpperCase(str.charAt(high)));
                count++;

            } else if (Character.isDigit(str.charAt(high))) {
                ans.insert(0, str.charAt(high));
                count++;

            }
            // ans.insert(0, Character.toUpperCase(str.charAt(high)));
            // count++;
            if (count == k) {
                ans.insert(0, '-');
                count = 0;
            }
            high--;
        }

        return ans.toString();
    }

}