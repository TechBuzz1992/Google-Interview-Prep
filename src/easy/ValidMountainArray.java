package easy;

//import java.util.*;

public class ValidMountainArray {
    public static void main(String[] args) {
        
    }

    public boolean isMountainArray(int[] nums){
        int i = 0;
        while(i<nums.length && i+1<nums.length && nums[i]< nums[i+1]){
            i++;
        }
        if(i == 0 || i>=nums.length){
            return false;
        }

        while(i<nums.length && i+1<nums.length){
            if(nums[i]<nums[i+1]){
                return false;
            }
            i++;
        }

        return true;
    }

    
}