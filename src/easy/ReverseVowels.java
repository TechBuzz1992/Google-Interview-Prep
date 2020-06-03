package easy;

import java.util.*;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "leetcode";
         ReverseVowels obj = new ReverseVowels();
         System.out.println(obj.reverseVowels(str));
        
    }

    public String reverseVowels(String str){
        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.length()-1;
        while(i<j && j<arr.length){
            while(i<j && !isVowel(arr[i])){
                i++;
            }
            while(j>i && !isVowel(arr[j])){
                j--;

            }

            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;

        }

        return new String(arr);
    }

    public boolean isVowel(char c){
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        if(set.contains(c)){
            return true;
        }

        else{
            return false;
        }

    }
    
}