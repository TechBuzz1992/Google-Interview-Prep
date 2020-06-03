package easy;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "cat";
        String t = "rac";

        ValidAnagram obj = new ValidAnagram();

        System.out.println(obj.isValidAnagram(s, t));

    }

    public boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr = new char[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (arr[c - 'a'] <= 0) {
                return false;

            } else {
                arr[c - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;

    }

}