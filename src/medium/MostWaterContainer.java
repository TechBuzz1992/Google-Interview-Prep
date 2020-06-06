package medium;

public class MostWaterContainer {
    public static void main(String[] args) {

    }

    public int maxWater(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(heights[left], heights[right])) * (right - left);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;

            }
        }

        return maxArea;
    }

}