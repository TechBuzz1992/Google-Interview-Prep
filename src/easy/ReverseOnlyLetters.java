package easy;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String str = "a-b-c-d";
        ReverseOnlyLetters obj = new ReverseOnlyLetters();
        System.out.println(obj.revereseLettersOnly(str));

    }

    public String revereseLettersOnly(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] arr = str.toCharArray();
        while (i < j) {

            while (i < j && !Character.isLetter(arr[i])) {
                i++;
            }

            while (j > i && !Character.isLetter(arr[j])) {
                j--;
            }

            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;

        }

        return new String(arr);

    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}