package easy;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = {2,3,1,4,5,2,3};
        System.out.println(Arrays.toString(new SortByParity().sortByParity(nums)));
        
    }

    public int[] sortByParity(int[] nums){
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                int temp = nums[index];
                nums[index++] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }
    
}