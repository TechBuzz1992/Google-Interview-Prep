package easy;

import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        String ransomeNote  = "ac";
        String magazine = "aab";

        RansomNote obj = new RansomNote();
        System.out.println(obj.canConstructRansomNote(ransomeNote, magazine));
        
    }

    public boolean canConstructRansomNote(String ransomeNote, String magazine){
        Map<Character,Integer> count = new HashMap<>();
        for(char c: magazine.toCharArray()){
            count.put(c,count.getOrDefault(c, 0)+1);
        }

        for(char c : ransomeNote.toCharArray()){
            if(!count.containsKey(c) || count.get(c) <= 0){
                return false;
            }
            else{
                count.put(c,count.get(c)-1);
            }
        }

        return true;

    }
    
}