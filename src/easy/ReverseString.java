package easy;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        
        
    }

    public String reverseString(String str){
        int i = 0;
        int j = str.length()-1;
        char[] arr = str.toCharArray();
        while(i<j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }

        return new String(arr);
    }
    
}