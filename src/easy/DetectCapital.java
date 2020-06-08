package easy;

public class DetectCapital {
    public static void main(String[] args) {
        String str1 = "USA";
        String str2 = "leetcode";
        String str3 = "Medium";
        String str4 = "medium";

        System.out.println(new DetectCapital().detectCapitalUse(str1));
        System.out.println(new DetectCapital().detectCapitalUse(str2));
        System.out.println(new DetectCapital().detectCapitalUse(str3));
        System.out.println(new DetectCapital().detectCapitalUse(str4));
        
    }

    public boolean detectCapitalUse(String str){
        int count = 0;
        int i = 0;
        while(i<str.length()){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
            i++;
        }

        return count == 0 || count == 1 && Character.isUpperCase(str.charAt(0)) || count == str.length();
    }

    
}