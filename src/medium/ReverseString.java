package medium;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(new ReverseString().reverse("harsh dusane"));


    }

    public String reverse(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        int start = 0;
        int end = str.length() - 1;
        char[] arr = str.toCharArray();
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return new String(arr);

    }

}